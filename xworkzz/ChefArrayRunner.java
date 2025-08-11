class ChefArrayRunner {
	public static void main (String [] args){
	
	ChefArray[] chef = new ChefArray[2];
	
	ChefArray chef1= new ChefArray();
	chef1.setName("Riya");
	chef1.setSkillLevel('A');
	chef1.setSignatureDish("Dosa");
	
	chef[0]=chef1;
	
	ChefArray chef2= new ChefArray();
	chef2.setName("priya");
	chef2.setSkillLevel('A');
	chef2.setSignatureDish("puliyogre");
	
	chef[1]=chef2;
	
	for(int i=0;i<chef.length;i++){
		System.out.println("ChefArray===="+(i+1));
		ChefArray localChef=chef[i];
		System.out.println(localChef.getName());
		System.out.println(localChef.getSkillLevel());
		System.out.println(localChef.getSignatureDish());
		System.out.println("  ----------------------------- ");
		
		
	}
}
	
}