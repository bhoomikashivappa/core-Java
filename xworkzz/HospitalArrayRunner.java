class HospitalArrayRunner {
	public static void main(String [] args){
		
		HospitalArray[] hospitals= new HospitalArray[2];
		
		//first hospital object
		HospitalArray hospital= new HospitalArray();
		hospital.setName("Jayadeva");
		hospital.setAddres("Micro Layout");
		System.out.println(hospital.getAddres());
		System.out.println();
		
		hospitals[0] = hospital;
		
		//second hospital object
		HospitalArray hospital1=new HospitalArray();
		hospital1.setName("Nimanhas");
		hospital1.setAddres("");
		
		hospitals[1]=hospital1;
		
		//loop to print hospital details
		for(int i=0;i<hospitals.length;i++){
			System.out.println("Hospital==="+(i+1));
			System.out.println();
			HospitalArray localHospital = hospitals[i];
			System.out.println(localHospital.getName());
			
			System.out.println(localHospital.getAddres());
			
		}
	}
}