package lab1.exercise1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class InvoiceTest {
	static Invoice in1 = new Invoice();
	static Invoice in2 = new Invoice();
	@BeforeClass
	public static void CreateSomeItems() {


		in1.add(new InvoiceItem("10", "wida", 3, 1.2));
		in1.add(new InvoiceItem("11", "widb", 6, 2.4));
		in1.add(new InvoiceItem("12", "widc", 4, 4.6));

		in2.add(new InvoiceItem("13", "widd", 1, 6.50));
		in2.add(new InvoiceItem("14", "wide", 9, 11.50));
		in2.add(new InvoiceItem("15", "widf", 6, 12.60));
	}

	// test serialnumber
	@Test
	public void testInvoice() {

	}

	@Test
	public void testAdd() {
		
	}

	@Test
	public void testGetTotal() {
		double total1 = 3*1.2 + 6 * 2.4 + 4*4.6;
		System.out.println(total1);
		System.out.println(in1.getTotal());
		assertEquals(total1,in1.getTotal(),0.1);
	}

	@Test
	public void testGetNumItems() {
		assertEquals(3,in1.getNumItems());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testGetItem() {
		in1.getItem(-1);
	}

}
