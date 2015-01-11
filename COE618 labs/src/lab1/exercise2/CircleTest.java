package lab1.exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test (expected = IllegalArgumentException.class)
	public void testScale() {
		Circle c = new Circle(1,2,2.4);
		c.scale(-1);
	}

}
