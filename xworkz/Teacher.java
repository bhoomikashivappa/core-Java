class Teacher {
	public static void main(String[] args){
		int[] teacherId = {1, 2};
		float[] salary = {35000.5f, 40000.75f};
		double[] experience = {5.5, 10.2};
		char[] grade = {'A', 'B'};
		boolean[] isActive = {true, true};
		String[] subject = {"Math", "Science"};
		short[] age = {30, 35};
		long[] mobile = {9876543210L, 9876543211L};
		byte[] section = {1, 2};
		Object[] misc = {"PHD", 15, false};
		
		for(int i=0;i<teacherId.length;i++){
			System.out.println(teacherId[i]);
		}
		for(int i=0;i<salary.length;i++){
			System.out.println(salary[i]);
		}
		for(int i=0;i<experience.length;i++){
			System.out.println(experience[i]);
		}
		for(int i=0;i<grade.length;i++){
			System.out.println(grade[i]);
		}
		for(int i=0;i<isActive.length;i++){
			System.out.println(isActive[i]);
		}
		for(int i=0;i<subject.length;i++){
			System.out.println(subject[i]);
		}
		for(int i=0;i<age.length;i++){
			System.out.println(age[i]);
		}
		for(int i=0;i<mobile.length;i++){
			System.out.println(mobile[i]);
		}
		for(int i=0;i<section.length;i++){
			System.out.println(section[i]);
		}
		for(int i=0;i<misc.length;i++){
			System.out.println(misc[i]);
		}
	}
}