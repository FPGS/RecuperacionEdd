package b;

import static org.junit.Assert.assertEquals;

import java.awt.Dimension;

import javax.swing.JTextField;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MySwingProgramTest {

	@Test
	public void testSuma() {

		assertEquals("error", program.suma(valor1, valor2));

		Mockito.when(valor1.getSize()).thenReturn(new Dimension(0, 0));
		Mockito.when(valor2.getSize()).thenReturn(new Dimension(0, 0));
		assertEquals("los campos tiene un tamaño igual", program.suma(valor1, valor2));

		Mockito.when(valor1.isEditable()).thenReturn(true);
		Mockito.when(valor1.getText()).thenReturn("1");
		Mockito.when(valor2.isEditable()).thenReturn(true);
		Mockito.when(valor2.getText()).thenReturn("20");
		assertEquals("el valor obtenido es 1 + 20",
				program.suma(valor1, valor2));
		
	}

	private MySwingProgram program = new MySwingProgram();

	@Mock
	private JTextField valor1;

	@Mock
	private JTextField valor2;
}
