class TempleArrayRunner {
	public static void main (String [] args){
		TempleArray[] temple = new TempleArray[5];
		
		TempleArray temple1=new TempleArray();
		temple1.setName("Iscone");
		temple1.setAddres("Rajajinagar");
		temple1.setStep(120);
		
		TempleArray temple2=new TempleArray();
		temple2.setName("Mariyamma");
		temple2.setAddres("Maleshvaram");
		temple2.setStep(150);
		
		TempleArray temple3=new TempleArray();
		temple3.setName("Anjaneya");
		temple3.setAddres("Btm");
		temple3.setStep(30);
		
		TempleArray temple4=new TempleArray();
		temple4.setName("Ganapati");
		temple4.setAddres("HSR");
		temple4.setStep(50);
		
		for(int i=0;i<temple.length;i++){
			if(i==0){
				temple[i]=temple1;
			}else if(i==1){
				temple[i]=temple2;
			}else if(i==2){
				temple[i]=temple3;
			}else if(i==3){
				temple[i]=temple4;
			}
		}
		
		for(int i=0;i<temple.length;i++){
			TempleArray localTemple= temple[i];
			if(localTemple!=null){
				System.out.println(localTemple.getName());
				System.out.println(localTemple.getAddres());
				System.out.println(localTemple.getStep());
				System.out.println("-------------------------");
			}
			else{
				System.out.println("Not found");
			}
		}
	}
}