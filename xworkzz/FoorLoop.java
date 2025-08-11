class FoorLoop {
	
	public  final String EXCEUTION = "Exceution for loop";
	public static void main (String [] args){
		
		String EXCEUTION = "Exceution for loop in non static metod ";
		
		int a = 10;
		System.out.println(a);
		
		for(int i=1; i<1000; i++){
			int z = i + 1;
			System.out.println(EXCEUTION + z);
		}
		
		System.out.println(EXCEUTION);



}

}