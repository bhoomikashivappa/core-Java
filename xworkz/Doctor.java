class Doctor{

String name;
int age;
String specialization;
int experience;
boolean isSurgeon;

Doctor(){
}
public static void main (String [] args){
System.out.println();



Doctor doctor1 = new Doctor();
doctor1.name= "Prasanna";
System.out.println("Doctor Name is :" + doctor1.name);

doctor1.setName("Vivek");
System.out.println("Doctor Name is : " + doctor1.name);
System.out.println();


Doctor doctor2 = new Doctor();
doctor2.age=37;
System.out.println("Doctor age is :" + doctor2.age);

doctor2.setAge(39);
System.out.println("Doctor age is : " + doctor2.age);
System.out.println();


Doctor doctor3 = new Doctor();
doctor3.specialization = "Ortho" ;
System.out.println("Doctor specialization  is : " + doctor3.specialization);

doctor3.setSpecialization("Cardino");
System.out.println("Doctor specialization  is : " + doctor3.specialization);
System.out.println();


Doctor doctor4 = new Doctor();
doctor4.experience = 20;
System.out.println("Doctor experience  is : " + doctor4.experience);

doctor4.setExperience(25);
System.out.println("Doctor experience  is : " + doctor4.experience);
System.out.println();


Doctor doctor5= new Doctor();
doctor5. isSurgeon = true;
System.out.println("Doctor  is Surgeon : " + doctor5. isSurgeon);

doctor5.setIsSurgeon(false);
System.out.println("Doctor  is Surgeon : " + doctor5. isSurgeon);
System.out.println();

}

public void setName(String  docName){
name= docName;
}

public void setAge(int  docAge){
age = docAge;
}

public void setSpecialization(String  docSpecialization){
specialization = docSpecialization;
}

public void setExperience(int  docExperience){
experience=docExperience;
}

public void setIsSurgeon (boolean docSurgeon ){
isSurgeon = docSurgeon ;
}
}

