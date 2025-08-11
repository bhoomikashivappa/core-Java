class BakeryArrayRunner {
	public static void main (String [] args){
		BakeryArray[] bakery = new BakeryArray[2];
		
		BakeryArray bakery1 = new BakeryArray();
		bakery1.setName("Sweet Tooth");
		bakery1.setRating(4.8f);
		bakery1.setSpecialty("Cupcakes");
		bakery1.setOpenDay('M');
		
		bakery[0]=bakery1;
		
		BakeryArray bakery2 = new BakeryArray();
		bakery2.setName("Sweet Peda");
		bakery2.setRating(4.9f);
		bakery2.setSpecialty("Cup");
		bakery2.setOpenDay('S');
		
		bakery[1]=bakery2;
		
		for(int i=0;i<bakery.length;i++){
			System.out.println("BakeryArray==="+(i+1));
			BakeryArray localBakery=bakery[i];
			System.out.println(localBakery.getName());
			System.out.println(localBakery.getRating());
			System.out.println(localBakery.getSpecialty());
			System.out.println(localBakery.getOpenDay());
		}
	}
}