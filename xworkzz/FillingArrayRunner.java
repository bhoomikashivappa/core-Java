class FillingArrayRunner {
	public static void main(String [] args){
		FillingArray [] filling = new FillingArray[2];
		
		FillingArray filling1 = new FillingArray();
		filling1.setName("ABCD");
		filling1.setLevel('A');
		filling1.setTaste("XYZ");
		
		filling[0]=filling1;
		
		FillingArray filling2 = new FillingArray();
		filling2.setName("ABCDEF");
		filling2.setLevel('B');
		filling2.setTaste("XYZABC");
		
		filling[1]=filling2;
		
		for(int i=0;i<filling.length;i++){
			System.out.println("FillingArray==="+(i+1));
			FillingArray localFilling= filling[i];
			System.out.println(localFilling.getName());
			System.out.println(localFilling.getLevel());
			System.out.println(localFilling.getTaste());
			
		}
		
	}
}