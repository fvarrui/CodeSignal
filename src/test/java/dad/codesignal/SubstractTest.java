package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SubstractTest {
	
	private Substract subtract;
	
	@Before
	public void setup() {
		subtract = new Substract();
	}
	
	@Test
	public void test1() {
		assertEquals(-1, subtract.solution(1, 2));
	}

}
