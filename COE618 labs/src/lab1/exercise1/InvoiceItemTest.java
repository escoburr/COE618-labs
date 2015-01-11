package lab1.exercise1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceItemTest {

	@Test
	public void testEquals(){
		System.out.println("equals");
		InvoiceItem instance = new InvoiceItem("x", "wid",3,1.2);
		
		assertTrue(instance.equals(new InvoiceItem("x", "wid",3,1.2)));
		assertFalse(instance.equals(new String("123")));
		assertFalse(instance.equals(null));
	}
	@Test
	public void testGetTotal() {
		System.out.println("getQuantity");
		InvoiceItem instance = new InvoiceItem("x", "wid",3,1.2);
		int expResult = 3;
		int result = instance.getQuantity();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetQuantity() {
		System.out.println("setQuantity");
		InvoiceItem instance = new InvoiceItem("x", "wid",3,1.2);
		int expResult = 1;
		instance.setQuantity(1);
		assertEquals(expResult, instance.getQuantity());
	}

	@Test
	public void testToString() {
		System.out.println("toString");
		InvoiceItem instance = new InvoiceItem("x","wid",3,1.2);
		String expResult = "x,wid,1.2,3";
		assertEquals(expResult,instance.toString());
	}

}
