class LaptopArray {
    private String processor;
    private int ram;
    private double price;
	
	public void setProcessor(String processor){
		this.processor=processor;
	}
	public void setRam(int ram){
		this.ram=ram;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getProcessor(){
		return processor;
	}
	public int getRam(){
		return ram;
	}
	public double getPrice(){
		return price;
	}
	
}