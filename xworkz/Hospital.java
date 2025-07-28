class Hospital {
	public static void main(String[] args){
		int[] bedCount = {50, 100};
		float[] rating = {4.5f, 3.8f};
		double[] fees = {1500.5, 2000.75};
		char[] ward = {'A', 'B'};
		boolean[] isOpen = {true, false};
		String[] department = {"Cardio", "Neuro"};
		short[] years = {10, 20};
		long[] regNo = {1234567890L, 9876543210L};
		byte[] floor = {1, 2};
		Object[] services = {"Emergency", true, 24};
		
		for(int i=0;i<bedCount.length;i++){
			System.out.println(bedCount[i]);
		}
		for(int i=0;i<rating.length;i++){
			System.out.println(rating[i]);
		}
		for(int i=0;i<fees.length;i++){
			System.out.println(fees[i]);
		}
		for(int i=0;i<ward.length;i++){
			System.out.println(ward[i]);
		}
		for(int i=0;i<isOpen.length;i++){
			System.out.println(isOpen[i]);
		}
		for(int i=0;i<department.length;i++){
			System.out.println(department[i]);
		}
		for(int i=0;i<years.length;i++){
			System.out.println(years[i]);
		}
		for(int i=0;i<regNo.length;i++){
			System.out.println(regNo[i]);
		}
		for(int i=0;i<floor.length;i++){
			System.out.println(floor[i]);
		}
		for(int i=0;i<services.length;i++){
			System.out.println(services[i]);
		}
	}
}