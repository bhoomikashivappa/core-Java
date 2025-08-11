class New{
	public static void main(String [] args){
		int[] empID = new int[5];
		
		for (int i=0;i<empID.length;i++){
			System.out.println(empID[i]);
		}
		empID[0]=1;
		System.out.println(empID[0]);
		System.out.println(empID[1]);
		for(int i=0;i<empID.length;i++){
			empID[i] = i+10;
		}
		for(int i=0;i<empID.length;i++){
			System.out.println(empID[i]);
		}
		
	}
}