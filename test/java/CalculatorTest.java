
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest extends Calculator {
Calculator nCrunch = new Calculator();
	@Test
	void testAdd() {
		
		Assertions.assertEquals(2,nCrunch.getAdd("1 + 1"));
		
	}
	
	@Test
	void testSub() {
		Assertions.assertEquals(0,nCrunch.getSub("1 - 1"));
	
	}

	@Test
	void testMult() {
		Assertions.assertEquals(1,nCrunch.getMult("1 * 1"));
	
	}

	@Test
	void testDiv() {
		Assertions.assertEquals(2, nCrunch.getDiv("2 / 1"));
		
	}

	@Test
	void testMod() {
		Assertions.assertEquals(1,nCrunch.getMod("1 % 2"));
		
	}


}
