class Sides {
	private String itemName;
	private int quantity;
	private float price;
	
	public Sides(String itemName,int quantity,float price){
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
	}
	
	public String getItemName(){
		return itemName;
	}
	public int getQuantity(){
		return quantity;
	}
	public float getPrice(){
		return price;
	}
}