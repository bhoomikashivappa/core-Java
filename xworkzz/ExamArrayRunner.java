class ExamArrayRunner {
	public static void main(String [] args){
		ExamArray[] exam =new ExamArray[5];
		
		ExamArray exam1 = new ExamArray();
		exam1.setRollNumbers(1);
		exam1.setScores(2.2f);
		exam1.setSubject("Java");
		
		for(int i=0;i<exam.length;i++){
			if(i==0){
				exam[0]=exam1;
			}
		}
		
		for(int i=0;i<exam.length;i++){
			ExamArray localExam = exam[i];
			if(localExam!=null){
				System.out.println(localExam.getRollNumbers());
				System.out.println(localExam.getScores());
				System.out.println(localExam.getSubject());
			}
		}
	}
}