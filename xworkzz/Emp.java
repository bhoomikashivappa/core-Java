class  Emp{

static  String name;
static  int Id;

public static void main(String[] args){

String empName = nameOfEmp();
System.out.println(empName);

int empId = idOfEmp();
System.out.println(empId);
}

public static String nameOfEmp(){
return name;
}

public static int idOfEmp(){
return Id;
}
}