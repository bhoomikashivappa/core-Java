class IcingArrayRunner {
	public static void main(String [] args){
		IcingArray[] icing = new IcingArray[2];
		
		IcingArray icing1=new IcingArray();
		icing1.setType("Cream Cheese");
		icing1.setColor('W');
		icing1.setFlavor("Venilla");
		icing1.setTexture('A');
		
		icing[0]=icing1;
		
		IcingArray icing2 = new IcingArray();
		icing2.setType("Cheese");
		icing2.setColor('E');
		icing2.setFlavor("REDVELVET");
		icing2.setTexture('F');
		
		icing[1]=icing2;
		
		for(int i=0;i<icing.length;i++){
			System.out.println("IcingArray==="+(i+1));
			IcingArray localIcing = icing[i];
			System.out.println(localIcing.getType());
			System.out.println(localIcing.getColor());
			System.out.println(localIcing.getFlavor());
			System.out.println(localIcing.getTexture());
			
		}
	}
}