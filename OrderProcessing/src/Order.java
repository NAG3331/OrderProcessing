
public class Order {
	
	private String orderId;
	private int quantity;
	
	
	public Order(String orderId, int quantity) {
		
		this.orderId = orderId;
		this.quantity = quantity;
	}
	

	 public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
