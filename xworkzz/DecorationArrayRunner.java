class DecorationArrayRunner {
	public static void main (String [] args){
		DecorationArray[] decoration = new DecorationArray[2];
		
		DecorationArray decoration1 = new DecorationArray();
		decoration1.setTopping("Choco Chips");
		decoration1.setCandles(2);
		decoration1.setIcingThickness(1500.00f);
		decoration1.setHasSprinkles(true);
		decoration1.setTheme('A');
		
		decoration[0]=decoration1;
		
		DecorationArray decoration2 = new DecorationArray();
		decoration2.setTopping("ABCD");
		decoration2.setCandles(2);
		decoration2.setIcingThickness(1200.00f);
		decoration2.setHasSprinkles(false);
		decoration2.setTheme('B');
		
		decoration[1]=decoration2;
		
		for(int i=0;i<decoration.length;i++){
			System.out.println("Decoration==="+(i+1));
			DecorationArray localDecoration = decoration[i];
			
			System.out.println(localDecoration.getTopping());
			System.out.println(localDecoration.getCandles());
			System.out.println(localDecoration.getIcingThickness());
			System.out.println(localDecoration.getHasSprinkles());
			System.out.println(localDecoration.getTheme());
		}
	}
}