import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {

	Triangle tri = null;
	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testIsTriangle() {
		tri = new Triangle(-1,-1,-1);
		assertEquals(false, tri.isTriangle(tri));
	}
	@Test
	public void testIsTriangle1() {
		tri = new Triangle(1,-1,-1);
		assertEquals(false, tri.isTriangle(tri));
	}
	@Test
	public void testIsTriangle2() {
		tri = new Triangle(1,1,-1);
		assertEquals(false, tri.isTriangle(tri));
	}
	@Test
	public void testIsTriangle3() {
		tri = new Triangle(1,1,1);
		assertEquals(true, tri.isTriangle(tri));
	}
	@Test
	public void testIsTriangle4() {
		tri = new Triangle(1,2,4);
		assertEquals(false, tri.isTriangle(tri));
	}
	@Test
	public void testIsTriangle5() {
		tri = new Triangle(2,1,4);
		assertEquals(false, tri.isTriangle(tri));
	}
	@Test
	public void testIsTriangle6() {
		tri = new Triangle(2,4,1);
		assertEquals(false, tri.isTriangle(tri));
	}
	@Test
	public void testIsTriangle7() {
		tri = new Triangle(2,3,1);
		assertEquals(false, tri.isTriangle(tri));
	}
	

	@Test
	public void testGetType() {
		tri = new Triangle(1,1,1);
		assertEquals("Regular",tri.getType(tri));
	}

	@Test
	public void testGetType1() {
		tri = new Triangle(2,2,3);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testGetType11() {
		tri = new Triangle(2,3,2);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testGetType12() {
		tri = new Triangle(3,2,2);
		assertEquals("Isosceles",tri.getType(tri));
	}
	@Test
	public void testGetType2() {
		tri = new Triangle(3,4,5);
		assertEquals("Scalene",tri.getType(tri));
	}

	@Test
	public void testGetType3() {
		tri = new Triangle(-3,4,5);
		assertEquals("Illegal",tri.getType(tri));
	}
	
	@Test
	public void testGetBorders() {
		tri = new Triangle(1,2,3);
		tri.getBorders();
	}

}
