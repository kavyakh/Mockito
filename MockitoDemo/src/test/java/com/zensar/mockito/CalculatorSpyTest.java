package com.zensar.mockito;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorSpyTest {
	Calculator calculator = new Calculator();

	@Test
	public void addTest1() {
		//Calculator calculatorSpy = Mockito.spy(calculator);
		Calculator calculatorSpy = Mockito.spy(Calculator.class);
		//Mockito.when(calculatorSpy.add(100, 50)).thenReturn(150);
		Mockito.when(calculatorSpy.add(100, 50)).thenCallRealMethod();
		assertEquals(150,calculatorSpy.add(100, 50));
		
	}
}
