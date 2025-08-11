class CarEngineRunner {
	public static void main (String [] args){
		Car1 car1 = new Car1("Toyota",4,"Black" ,"mbnkj","petrol");
		
		Engine engine = new Engine(1999,"kwqjioj" ,"iejio1");
		car1.setEngine(engine);
		
		System.out.println("car details==================");
		System.out.println(car1.getName());
		System.out.println(car1.getWheels());
		System.out.println(car1.getfeatures());
		System.out.println(car1.getFuelType());
		System.out.println("-----------------------------------------------------");
		
		Engine engine1= car1.getEngine();
		System.out.println("car engine details==================");
		System.out.println(engine1.getengineType());
		System.out.println(engine1.getName());
		System.out.println(engine1.getEngineCC());
		
	
	}
}