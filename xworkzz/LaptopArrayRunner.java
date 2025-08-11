class LaptopArrayRunner{
	public static void main (String [] args){
		LaptopArray[] laptop=new LaptopArray[5];
		
		LaptopArray laptop1=new LaptopArray();
		laptop1.setProcessor("i5");
		laptop1.setRam(68);
		laptop1.setPrice(760000.00);
		
		LaptopArray laptop2=new LaptopArray();
		laptop2.setProcessor("i5");
		laptop2.setRam(68);
		laptop2.setPrice(760000.00);
		
		LaptopArray laptop3=new LaptopArray();
		laptop3.setProcessor("i5");
		laptop3.setRam(68);
		laptop3.setPrice(760000.00);
		
		for(int i=0;i<laptop.length;i++){
			if(i==0){
				laptop[i]=laptop1;
			}else if(i==1){
				laptop[i]=laptop2;
			}else if(i==2){
				laptop[i]=laptop3;
			}
		}
		
		for(int i=0;i<laptop.length;i++){
			LaptopArray localLaptop = laptop[i];
			if(localLaptop!=null){
				System.out.println(localLaptop.getProcessor());
				System.out.println(localLaptop.getRam());
				System.out.println(localLaptop.getPrice());
				System.out.println("-------------------");
			}
		}
		
		
	}
}