
package lab1.exercise1;

import java.util.ArrayList;

public class Invoice {
	
	public int serial;
	public static int serialNumber;
	public ArrayList<InvoiceItem> itemList;
	
	public Invoice (){
		itemList = new ArrayList<>();
		serial = ++serialNumber;
	}

	public void add(InvoiceItem item) {
		// REQUIRES: item should not be null
		// MODIFIES:
		// EFFECTS:adds InvoiceItem to ArrayList<InvoiceItem>
		itemList.add(item);

	}

	public double getTotal() {
		// REQUIRES:
		// MODIFIES:
		// EFFECTS: returns total amount owed (prices * quantity)
		double total = 0;
		for (InvoiceItem i : itemList ){
			total += i.getQuantity()*i.getPrice();
		}
		return total;

	}

	public int getNumItems() {
		// REQUIRES:
		// MODIFIES:
		// EFFECTS:returns number of InvoiceItems in Invoice
		return itemList.size();
	}

	public InvoiceItem getItem(int i) {
		// REQUIRES:
		// MODIFIES:
		// EFFECTS: throws IllegalArgumentException if index is invalid 
		if (i<0 || i>=itemList.size()) throw new IllegalArgumentException("Invalid index"); 
		return itemList.get(i);

	}
	
	public int getSerialNumber(){
		return serial;
	}


	
	

}
