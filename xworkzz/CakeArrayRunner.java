class CakeArrayRunner {
	public static void main (String [] args){
		CakeArray [] cake = new CakeArray[2];
		
		CakeArray cake1 = new CakeArray();
		cake1.setFlavor("REDVELVET");
		cake1.setLayers(2);
		cake1.setWeightInKg(2.5f);
		cake1.setIsEggless(true);
		cake1.setShape('A');
		System.out.println(cake1.getFlavor());
		System.out.println(cake1.getLayers());
		System.out.println(cake1.getWeightInKg());
		System.out.println(cake1.getIsEggless());
		System.out.println(cake1.getShape());
		
		cake[0] = cake1;
		
		CakeArray cake2 = new CakeArray();
		cake2.setFlavor("Chocolete");
		cake2.setLayers(3);
		cake2.setWeightInKg(1.5f);
		cake2.setIsEggless(false);
		cake2.setShape('B');
		System.out.println(cake2.getFlavor());
		System.out.println(cake2.getLayers());
		System.out.println(cake2.getWeightInKg());
		System.out.println(cake2.getIsEggless());
		System.out.println(cake2.getShape());
		
		cake[1]=cake2;
		
		for(int i=0;i<cake.length;i++){
			System.out.println("Cake==="+(i+1));
			CakeArray localCake = cake[i];
			System.out.println(localCake.getFlavor());
			
			System.out.println(localCake.getLayers());
		}
	}
}