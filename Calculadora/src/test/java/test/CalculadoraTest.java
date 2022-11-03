package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JLabel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.frame.Calculadora;



public class CalculadoraTest {

	
	@BeforeEach
	public void before() {
		new Calculadora();

	}
	
	@Test
	public void testSumar() throws NoSuchFieldException, SecurityException {

		JLabel op = new JLabel();
		double result = Calculadora.sumar(op, 2, 3);
		double esperado = 5;
		assertEquals(esperado, result, 1);
		
	}
	
	@Test
	public void testRestar() throws NoSuchFieldException, SecurityException {

		JLabel op = new JLabel();
		double result = Calculadora.restar(op, 12, 7);
		double esperado = 5;
		assertEquals(esperado, result, 1);
		
	}

	@Test
	public void testMultiplicar() throws NoSuchFieldException, SecurityException {

		JLabel op = new JLabel();
		double result = Calculadora.multiplicar(op, 4, 5);
		double esperado = 20;
		assertEquals(esperado, result, 1);
		
	}
	
	@Test
	public void testDividir() throws NoSuchFieldException, SecurityException {

		JLabel op = new JLabel();
		double result = Calculadora.dividir(op, 14, 5);
		double esperado = 3;
		assertEquals(esperado, result, 1);
		
	}
}
