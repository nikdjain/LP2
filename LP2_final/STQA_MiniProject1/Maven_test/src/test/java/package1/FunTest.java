package package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunTest {


    @Test
	public void testArea_of_circle()
        {
		Fun.read();
		float ac= Fun.area_of_circle();
		assertTrue(ac >= 50);
	}

 @Test
	public void testPerimeter_of_circle() 
        {
		Fun.read();
		float pc= Fun.perimeter_of_circle();
		assertTrue(pc >= 50);
         }

 @Test
	public void testArea_of_squre() 
   {
		Fun.read();
		int as= Fun.area_of_squre();
		assertTrue(as >= 50);
	}

	@Test
	public void testPerimeter_of_squre() 
         {
		Fun.read();
		int p= Fun.perimeter_of_squre();
		assertTrue(p >= 50);
	}

	@Test
	public void testRight_angled()
        {
		Fun.read();
		float art= Fun.right_angled();
		assertTrue(art >= 50);
	}

	@Test
	public void testArea_of_rectangle() 
        {
		Fun.read();
		int ar= Fun.area_of_rectangle();
		assertTrue(ar >= 50);
	}

	@Test
	public void testCurcumference_of_circle()
         {
		Fun.read();
		float C= Fun.curcumference_of_circle();
		assertTrue(C >= 50);
	}

	@Test
	public void testArea_of_cube() 
          {
		Fun.read();
		int acc= Fun.area_of_cube();
		assertTrue(acc >= 50);
	}

	@Test
	public void testPerimeter_of_rectangle() 
          {
		Fun.read();
		int arr= Fun.perimeter_of_rectangle();
		assertTrue(arr >= 50);
	}

	
	@Test
	public void testArea_of_sphere() 
     {
		Fun.read();
		float sp= Fun.area_of_sphere();
		assertTrue(sp >= 50);
	}

	@Test
	public void testCylinder() 
      {
		Fun.read();
		int vc= Fun.cylinder();
		assertTrue(vc >= 50);
	}
	
	@Test
	public void testArea_of_cylinder() 
           {
		Fun.read();
		float sc= Fun.area_of_cylinder();
		assertTrue(sc >= 50);
	}

}
