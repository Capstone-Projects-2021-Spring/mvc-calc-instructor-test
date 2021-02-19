package edu.temple.cis3296;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorModelTest {
	CalculatorModel calc; 

	@Before 
	public void initialize(){
		calc = new CalculatorModel();
	}

	@Test
	public void shouldAddTwoPlusTwo(){
		// Assert 2.0 plus 2.0 is equals 4.0 plus or minus 0.1 epsilon
		// Double comparaison necessite to specify an epsilon. 
		assertEquals(4.0, calc.operationAdd(2.0, 2.0), 0.1);
	}

	@Test
	public void shouldAddTwoPlusThree(){
		assertEquals(5.0, calc.operationAdd(2.0, 3.0), 0.1);
	}

	@Test
	public void shouldSubstrTwoAndTwo(){
		assertEquals(0.0, calc.operationSubstr(2.0, 2.0), 0.1);
	} 

	@Test
	public void shouldMultOneByOne(){
		assertEquals(1.0, calc.operationMult(1.0, 1.0), 0.1);
	} 

	@Test
	public void shouldDivOneByOne(){
		assertEquals(1.0, calc.operationDiv(2.0, 2.0), 0.1);
	} 

	


}
