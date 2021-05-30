package package1;

import static org.junit.Assert.*;

import org.junit.Test;

import package1.JunitClass;

public class AddTest {

	@Test
	public void testAdd() {
		JunitClass junit = new JunitClass();
		int result = junit.add(300,200);
		assertEquals(500,result);
	}

}
