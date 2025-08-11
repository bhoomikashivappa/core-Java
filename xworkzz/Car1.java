class Car1 {
	private String name;
	private int wheels;
	private String Color;
	private String features;
	private String fuelType;
	private Engine engine;
	
	public Car1 (String name,int wheels,String Color,String features,String fuelType){
		this.name= name;
		this.wheels=wheels;
		this.Color=Color;
		this.features=features;
		this.fuelType=fuelType;
		
	}
	
	public Car1(String name,int wheels,String Color,String features,String fuelType,Engine engine){
		this(name,wheels,Color,features,fuelType);
		this.engine=engine;
	}
	
	public void setEngine(Engine engine){
		this.engine=engine;
	}
	public Engine getEngine(){
		return engine;
	}
	public String getName(){
		return name;
	}
	public int getWheels(){
		return wheels;
	}
	public String getfeatures(){
		return features;
	}
	public String getFuelType(){
		return fuelType;
	}
}