class Vehicle {
	public static void main(String [] args){
		int[] modelYear = {2020, 2021};
		float[] engineCapacity = {1.2f, 1.5f};
		double[] mileage = {18.5, 21.3};
		char[] fuelType = {'P', 'D'};
		boolean[] isInsured = {true, false};
		String[] brand = {"Honda", "Toyota"};
		short[] serviceCount = {3, 4};
		long[] chassisNo = {123456789012L};
		byte[] seatCount = {5, 7};
		Object[] info = {"SUV", true, 2021};
		
		for(int i=0;i<modelYear.length;i++){
			System.out.println(modelYear[i]);
		}
		for(int i=0;i<engineCapacity.length;i++){
			System.out.println(engineCapacity[i]);
		}
		for(int i=0;i<mileage.length;i++){
			System.out.println(mileage[i]);
		}
		for(int i=0;i<fuelType.length;i++){
			System.out.println(fuelType[i]);
		}
		for(int i=0;i<isInsured.length;i++){
			System.out.println(isInsured[i]);
		}
		for(int i=0;i<brand.length;i++){
			System.out.println(brand[i]);
		}
		for(int i=0;i<serviceCount.length;i++){
			System.out.println(serviceCount[i]);
		}
		for(int i=0;i<chassisNo.length;i++){
			System.out.println(chassisNo[i]);
		}
		for(int i=0;i<seatCount.length;i++){
			System.out.println(seatCount[i]);
		}
		for(int i=0;i<modelYear.length;i++){
			System.out.println(modelYear[i]);
		}
		for(int i=0;i<info.length;i++){
			System.out.println(info[i]);
		}
	}
}