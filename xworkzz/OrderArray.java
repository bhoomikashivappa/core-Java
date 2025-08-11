class OrderArray {
	private String orderId ;
	private int quantity ;
	private float totalAmount ;
	private boolean isDelivered ;
	private char deliverySlot ;
	
	public void setOrderId(String orderId){
		this.orderId=orderId;
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public void setTotalAmount(float totalAmount){
		this.totalAmount=totalAmount;
	}
	public void setIsDelivered(boolean isDelivered){
		this.isDelivered=isDelivered;
	}
	public void setDeliverySlot(char deliverySlot){
		this.deliverySlot=deliverySlot;
	}
	
	public String getOrderId(){
		return orderId;
	}
	public int getQuantity(){
		return quantity;
	}
	public float getTotalAmount(){
		return totalAmount;
	}
	public boolean getIsDelivered(){
		return isDelivered;
	}
	public char getDeliverySlot(){
		return deliverySlot;
	}

	
}