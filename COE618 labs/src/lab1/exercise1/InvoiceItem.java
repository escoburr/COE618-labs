package lab1.exercise1;

public class InvoiceItem {

	private String partNum;
	private String desc;
	private int quantity;
	private double price;

	public InvoiceItem(String partNum, String desc, int quantity, double price) {
		if (quantity < 0 || price < 0)
			throw new IllegalArgumentException("value cannot be negative");
		this.partNum = partNum;
		this.desc = desc;
		this.quantity = quantity;
		this.price = price;
	}

	public double getTotal() {
		return quantity * price;
	}

	public String getPartNum() {
		return partNum;
	}

	public String getDesc() {
		return desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0)
			throw new IllegalArgumentException("quantity cannot be negative");
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return partNum + "," + desc + "," + price + "," + quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof InvoiceItem){
			if (partNum.equals(((InvoiceItem) obj).getPartNum())
					&&desc.equals(((InvoiceItem) obj).getDesc())
					&&(quantity == ((InvoiceItem) obj).getQuantity())
					&&(price == ((InvoiceItem) obj).getPrice())					
					) return true;
		}
		return false;
	}
	
	

}
