class CollegeRunner {

public static void main(String[] args){

System.out.println("College name is: " + College.collegeName);

int totalStudents = College.getTotalStudentsInCollege();
System.out.println(totalStudents);

String location = College. locationOfCollege();
System.out.println(location);

String collegeName= College.getcollegeName();
System.out.println(collegeName);

double rating = College. getRatingOfCollege();
System.out.println(rating);

boolean  vtuClg = College.getVtuClg();
System.out.println(vtuClg);
}

}