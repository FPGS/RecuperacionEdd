package b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MySwingProgram extends JFrame {

	JButton sumar = new JButton();
	JTextField valor1 = new JTextField();
	JTextField valor2 = new JTextField();

	public MySwingProgram() {

		sumar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println(suma(valor1, valor2));
			}

		});

	}

	public String suma(JTextField valor1, JTextField valor2) {

		if (valor1.isEditable() && valor2.isEditable()) {
			return "el valor obtenido es " + valor1.getText() + " + " + valor2.getText();
		} else if (valor1.getSize() != null && valor1.getSize().equals(valor2.getSize())) {
			return "los campos tiene un tamaño igual";
		} else {
			return "error";
		}
	}

	public static void main(String[] args) {
		MySwingProgram program = new MySwingProgram();

	}
}
