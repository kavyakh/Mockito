package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorTest {
	//Tells Mockito to mock the calculator instance
	@Mock
    private Calculator calculator;
	
	@Rule 
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Test
	public void testAdd() {
		//Mockito.when(calculator.add(6, 4)).thenReturn(100);
		Mockito.when(calculator.add(6, 4)).thenCallRealMethod();
		System.out.println(calculator.add(6, 4));
		assertEquals(10,calculator.add(6, 4));
	}
	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		Mockito.when(calculator.divide(10,0)).thenThrow(ArithmeticException.class);
		System.out.println(calculator.divide(10, 0));
	}
}
