class GoodHotel {
	public static void main(String [] args){
		int[] roomNo = {101, 102};
		float[] ratings = {4.0f, 4.5f};
		double[] price = {1500.0, 2500.0};
		char[] category = {'A', 'B'};
		boolean[] isBooked = {false, true};
		String[] names = {"The Taj", "Leela"};
		short[] floor = {1, 2};
		long[] regId = {987654321098L};
		byte[] stars = {5, 4};
		Object[] services = {"AC", true, 2};
		
		for(int i=0;i<roomNo.length;i++){
			System.out.println(roomNo[i]);
		}
		for(int i=0;i<ratings.length;i++){
			System.out.println(ratings[i]);
		}
		for(int i=0;i<price.length;i++){
			System.out.println(price[i]);
		}
		for(int i=0;i<category.length;i++){
			System.out.println(category[i]);
		}
		for(int i=0;i<isBooked.length;i++){
			System.out.println(isBooked[i]);
		}
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		for(int i=0;i<floor.length;i++){
			System.out.println(floor[i]);
		}
		for(int i=0;i<regId.length;i++){
			System.out.println(regId[i]);
		}
		for(int i=0;i<stars.length;i++){
			System.out.println(stars[i]);
		}
		for(int i=0;i<services.length;i++){
			System.out.println(services[i]);
		}
	}
}