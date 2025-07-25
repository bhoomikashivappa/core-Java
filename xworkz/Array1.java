class Array1{
	public static void main(String[] args){
		String[] studentName = {"Bhoomika","Amogh","Priya","Syna"};
		byte[] studentCunt = {1,2,3,4,5};
		char[] clgSection = {'A','B','C','D'};
		long[] studentNumbr = {9663268385L,7349439508L, 9480727331L};
		short[] studentPresence = {1,0,1,1,1};
		float[] studentCGPA = {7.5f,7.8f,8.1f,8.5f};
		double[] studentFees = {20000.00,25000.00,25500.00};
		boolean[] booleanValue = {true,false,true,false};
		int[] totalClass = {8,9,10};
		
		
		for(int i=0;i<studentName.length;i++){
			System.out.println(studentName[i]);
			
		}
		
		for (int i=0;i<studentCunt.length;i++){
			System.out.println(studentCunt[i]);
		}
		
		for(int i=0;i<clgSection.length;i++){
			System.out.println(clgSection[i]);
		}
		for(int i=0;i<studentNumbr.length;i++){
			System.out.println(studentNumbr[i]);
		}
		for (int i=0;i<studentPresence.length;i++){
			System.out.println(studentPresence[i]);
		}
		for(int i=0;i<studentCGPA.length;i++){
			System.out.println(studentCGPA[i]);
		}
		for (int i=0;i<studentFees.length;i++){
			System.out.println(studentFees[i]);
		}
		for(int i=0;i<booleanValue.length;i++){
			System.out.println(booleanValue[i]);
		}
		for(int i=0;i<totalClass.length;i++){
			System.out.println(totalClass[i]);
		}
	}
}