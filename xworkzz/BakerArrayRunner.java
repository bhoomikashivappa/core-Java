class BakerArrayRunner {
	public static void main (String [] args){
		BakerArray [] baker = new BakerArray[2];
		
		BakerArray baker1 = new BakerArray();
		baker1.setName("Riya");
		baker1.setExperienceInYears(2);
		baker1.setRating(4.5f);
		baker1.setIsAvailable(true);
		baker1.setGender('A');
		/*System.out.println(baker1.getName());
		System.out.println(baker1.getExperienceInYears());
		System.out.println(baker1.getRating());
		System.out.println(baker1.getIsAvailable());
		System.out.println(baker1.getGender());*/
		
		baker[0]=baker1;
		
		BakerArray baker2 = new BakerArray();
		baker2.setName("Priya");
		baker2.setExperienceInYears(3);
		baker2.setRating(4.8f);
		baker2.setIsAvailable(false);
		baker2.setGender('B');
		/*System.out.println(baker2.getName());
		System.out.println(baker2.getExperienceInYears());
		System.out.println(baker2.getRating());
		System.out.println(baker2.getIsAvailable());
		System.out.println(baker2.getGender());*/
		
		baker[1]=baker2;
		
		for(int i=0;i<baker.length;i++){
			System.out.println(i+1);
			BakerArray localBaker = baker[i];
			
			System.out.println(localBaker.getName());
			System.out.println(localBaker.getExperienceInYears());
			System.out.println(localBaker.getRating());
			System.out.println(localBaker.getIsAvailable());
			System.out.println(localBaker.getGender());
			
			System.out.println(localBaker.getName());
			System.out.println(localBaker.getExperienceInYears());
			System.out.println(localBaker.getRating());
			System.out.println(localBaker.getIsAvailable());
			System.out.println(localBaker.getGender());
		}
	}
}