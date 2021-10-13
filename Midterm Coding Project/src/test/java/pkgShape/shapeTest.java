package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
class shapeTest {

	@Test
	void CircleTest1() {
		Circle c = new Circle(10);
		double c1Area = c.area();
		assertEquals(314.15,c1Area,0.01);	
	}
	
	@Test
	void EllipseTest1() {
		Ellipse e = new Ellipse(10,20);
		double e1Area = e.area();
		assertEquals(628.32,e1Area,0.02);
	}
	
	@Test
	void EllipsoidTest1() {
		Ellipsoid el = new Ellipsoid(10,20,25);
		double e2Area = el.volume();
		assertEquals(20943.95,e2Area,0.02);
	}
	
	@Test
	void circleCompareToTest1() {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		assertEquals(c1.compareTo(c2),1);
	}
	
	@Test
	void circleCompareToTest2() {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		assertEquals(c2.compareTo(c1),-1);
	}
	
	@Test
	void circleCompareToTest3() {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(10);
		assertEquals(c1.compareTo(c2),0);
	}
	
	@Test
	void ellipseCompareToTest1() {
		Ellipse e1 = new Ellipse(10,5);
		Ellipse e2 = new Ellipse(10,8);
		assertEquals(e1.compareTo(e2),-1);
	}
	
	@Test
	void ellipseCompareToTest2() {
		Ellipse e1 = new Ellipse(10,5);
		Ellipse e2 = new Ellipse(10,8);
		assertEquals(e2.compareTo(e1),1);
	}

	@Test
	void ellipseCompareToTest3() {
		Ellipse e1 = new Ellipse(10,5);
		Ellipse e2 = new Ellipse(10,5);
		assertEquals(e1.compareTo(e2),0);
	}
	
	@Test
	void ellipsoidCompareToTest1() {
		Ellipsoid el1 = new Ellipsoid(10,9,5);
		Ellipsoid el2 = new Ellipsoid(10,9,8);
		assertEquals(el1.compareTo(el2),-1);
	}
	
	@Test
	void ellipsoidCompareToTest2() {
		Ellipsoid el1 = new Ellipsoid(10,9,5);
		Ellipsoid el2 = new Ellipsoid(10,9,8);
		assertEquals(el2.compareTo(el1),1);
	}
	
	@Test
	void ellipsoidCompareToTest3() {
		Ellipsoid el1 = new Ellipsoid(10,9,5);
		Ellipsoid el2 = new Ellipsoid(10,9,5);
		assertEquals(el1.compareTo(el2),0);
	}

	@Test
	void isCircle1(){
		Ellipse e1 = new Ellipse(1,2);
		assertEquals(e1.isCircle(),false);
	}

}
