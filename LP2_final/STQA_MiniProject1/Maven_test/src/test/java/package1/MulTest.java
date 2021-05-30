package package1;

import static org.junit.Assert.*;

import org.junit.Test;

import package1.JunitClass;

public class MulTest {

	@Test
	public void testMul() {
		JunitClass junit = new JunitClass();
		int result = junit.mul(30,20);
		assertEquals(600,result);
	}

}
