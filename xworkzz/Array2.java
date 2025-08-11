class Array2{
	public static void main(String[] args){
		String[] nameEmp = {"Ram","Sham","priya"};
		char[] empLname = {'S','A','B'};
		int[] empId= {10,20,30};
		float[] empTime = {2.30f,3.30f};
		double[] empSalary = {5000.00,60000.00};
		short[] empShort ={1,2,3};
		long[] empLong ={9790709898L,997970979L};
		boolean[] empBoolean= {true,false};
		
		for(int i=0;i<nameEmp.length;i++){
			System.out.println(nameEmp[i]);
		}
		for(int i=0;i<empLname.length;i++){
			System.out.println(empLname[i]);
		}
		for(int i=0;i<empId.length;i++){
			System.out.println(empId[i]);
		}
		for(int i=0;i<empTime.length;i++){
			System.out.println(empTime[i]);
		}
		for(int i=0;i<empSalary.length;i++){
			System.out.println(empSalary[i]);
		}
		for(int i=0;i<empShort.length;i++){
			System.out.println(empShort[i]);
		}
		for(int i=0;i<empLong.length;i++){
			System.out.println(empLong[i]);
		}
		for(int i=0;i<empBoolean.length;i++){
			System.out.println(empBoolean[i]);
		}
		
	}
}