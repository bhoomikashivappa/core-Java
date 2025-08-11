class CollegeArrayRunner {
	public static void main (String [] args){
		CollegeArray[] college = new CollegeArray[5];
		
		CollegeArray college1 = new CollegeArray();
		college1.setStudentCount(200);
		college1.setDept("CSE");
		college1.setSemester(2);
		
		for(int i=0;i<college.length;i++){
			if(i==0){
				college[0]=college1;
			}
		}
		
		for(int i=0;i<college.length;i++){
			CollegeArray localCollege = college[i];
			if(localCollege!=null){
				System.out.println(localCollege.getStudentCount());
				System.out.println(localCollege.getDept());
				System.out.println(localCollege.getSemester());
			}
		}
	}
}