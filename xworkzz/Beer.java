class Beer {
	private String brand;
	private double alcoholContent;
	private float price;
	private float volem;
	private Sides sideItem;
	
	public Beer(String brand,double alcoholContent,float price,
	float volem){
	this.brand=brand;
	this.alcoholContent=alcoholContent;
	this.price=price;
	this.volem=volem;
	
	}
	
	public Beer (String brand,double alcoholContent,float price,
	float volem,Sides sideItem){
		this(brand,alcoholContent,price,volem);
		this.sideItem=sideItem;
	}
	
	public void setSideItem(Sides sideItem){
		this.sideItem=sideItem;
	}
	
	public Sides getSideItem(){
		return sideItem;
	}
	public String getBrand(){
		return brand;
	}
	public double getAlcoholContent(){
		return alcoholContent;
	}
	public float getPrice(){
		return price;
	}
	public float getVolem(){
		return volem;
	}
}