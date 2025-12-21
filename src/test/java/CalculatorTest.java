import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

	private static final Calculator calculator = new Calculator();

	@Test
	public void addTest(){
		
		int res = calculator.add(1, 2);
		assertEquals(res, 3);
	}
	@Test
	public void subtractTest(){
		int res = calculator.subtract(1, 2);
		assertEquals(res, -1);
	}
	@Test
	public void multiplyTest(){
		int res = calculator.multiply(1, 2);
		assertEquals(res, 2);
	}
	@Test
	public void divideTest(){
		int res = calculator.divide(10, 2);
		assertEquals(res, 5);
	}

}
