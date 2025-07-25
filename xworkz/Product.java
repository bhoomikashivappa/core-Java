class Product {
	public static void main(String[] args){
		int[] productId = {201, 202};
		float[] productWeight = {1.2f, 2.3f};
		double[] productPrice = {199.99, 299.99};
		char[] productRating = {'A', 'B'};
		boolean[] isAvailable = {true, false};
		String[] productName = {"Phone", "Laptop"};
		short[] warrantyYears = {1, 2};
		long[] serialNumber = {112233445566L};
		byte[] discount = {10, 20};
		Object[] details = {"Electronics", 5, false};
	
		for(int i=0;i<productId.length;i++){
			System.out.println(productId[i]);
		}
		for(int i=0;i<productWeight.length;i++){
			System.out.println(productWeight[i]);
		}
		for(int i=0;i<productPrice.length;i++){
			System.out.println(productPrice[i]);
		}
		for(int i=0;i<productRating.length;i++){
			System.out.println(productRating[i]);
		}
		for(int i=0;i<isAvailable.length;i++){
			System.out.println(isAvailable[i]);
		}
		for(int i=0;i<productName.length;i++){
			System.out.println(productName[i]);
		}
		for(int i=0;i<warrantyYears.length;i++){
			System.out.println(warrantyYears[i]);
		}
		for(int i=0;i<serialNumber.length;i++){
			System.out.println(serialNumber[i]);
		}
		for(int i=0;i<discount.length;i++){
			System.out.println(discount[i]);
		}
		for(int i=0;i<details.length;i++){
			System.out.println(details[i]);
		}
	}
}