class CakeArray {
	private String flavor ;
	int layers ;
	float weightInKg ;
	boolean isEggless ;
	char shape ; 
	
	public void setFlavor(String flavor){
		this.flavor=flavor;
	}
	public void setLayers(int layers){
		this.layers=layers;
	}
	public void setWeightInKg(float weightInKg){
		this.weightInKg=weightInKg;
	}
	public void setIsEggless(boolean isEggless){
		this.isEggless=isEggless;
	}
	public void setShape(char shape){
		this.shape=shape;
	}
	public String getFlavor(){
		return flavor;
	}
	public int getLayers(){
		return layers;
	}
	public float getWeightInKg(){
		return weightInKg;
	}
	public boolean getIsEggless(){
		return isEggless;
	}
	public char getShape(){
		return shape;
	}
}