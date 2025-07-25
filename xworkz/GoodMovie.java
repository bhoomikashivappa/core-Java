class GoodMovie {
	public static void main(String[] args){
		int[] duration = {120, 150};
		float[] imdb = {8.5f, 7.9f};
		double[] collection = {1.2e7, 2.5e7};
		char[] certificate = {'U', 'A'};
		boolean[] isReleased = {true, false};
		String[] title = {"Inception", "Interstellar"};
		short[] rating = {5, 4};
		long[] id = {10001L, 10002L};
		byte[] languageCode = {1, 2};
		Object[] details = {"Sci-Fi", true, 2010};
		
		for(int i=0;i<duration.length;i++){
			System.out.println(duration[i]);
		}
		for(int i=0;i<imdb.length;i++){
			System.out.println(imdb[i]);
		}
		for(int i=0;i<collection.length;i++){
			System.out.println(collection[i]);
		}
		for(int i=0;i<certificate.length;i++){
			System.out.println(certificate[i]);
		}
		for(int i=0;i<isReleased.length;i++){
			System.out.println(isReleased[i]);
		}
		for(int i=0;i<title.length;i++){
			System.out.println(title[i]);
		}
		for(int i=0;i<rating.length;i++){
			System.out.println(rating[i]);
		}
		for(int i=0;i<id.length;i++){
			System.out.println(id[i]);
		}
		for(int i=0;i<languageCode.length;i++){
			System.out.println(languageCode[i]);
		}
		for(int i=0;i<details.length;i++){
			System.out.println(details[i]);
		}
	}
}