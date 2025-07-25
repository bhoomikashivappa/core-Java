class GoodBook {
	public static void main(String [] args){
		int[] pages = {300, 450};
		float[] weight = {0.5f, 0.7f};
		double[] price = {299.99, 399.50};
		char[] language = {'E', 'H'};
		boolean[] isAvailable = {true, true};
		String[] title = {"Java", "Python"};
		short[] edition = {1, 2};
		long[] isbn = {9780135166307L};
		byte[] rating = {5, 4};
		Object[] extra = {"Hardcover", false, 2022};
		
		for(int i=0;i<pages.length;i++){
			System.out.println(pages[i]);
		}
		for(int i=0;i<weight.length;i++){
			System.out.println(weight[i]);
		}
		for(int i=0;i<price.length;i++){
			System.out.println(price[i]);
		}
		for(int i=0;i<language.length;i++){
			System.out.println(language[i]);
		}
		for(int i=0;i<isAvailable.length;i++){
			System.out.println(isAvailable[i]);
		}
		for(int i=0;i<title.length;i++){
			System.out.println(title[i]);
		}
		for(int i=0;i<edition.length;i++){
			System.out.println(edition[i]);
		}
		for(int i=0;i<isbn.length;i++){
			System.out.println(isbn[i]);
		}
		for(int i=0;i<rating.length;i++){
			System.out.println(rating[i]);
		}
		for(int i=0;i<extra.length;i++){
			System.out.println(extra[i]);
		}
	}
}