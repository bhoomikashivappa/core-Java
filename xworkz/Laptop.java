class Laptop{

static String brand = "HP";
static String processor = "Intel i7";
static double screenSize = 15.6;
static boolean hasSSD = true;
static int ramSizeGB = 16;

public static void main(String[] args){

String brand = "dell";
String processor = "Intel i5";
double screenSize = 15.8;
boolean hasSSD = false;
int ramSizeGB = 8;

System.out.println();
System.out.println(Laptop.brand);
System.out.println(Laptop.processor);
System.out.println(Laptop.screenSize);
System.out.println(Laptop.hasSSD);
System.out.println(Laptop.ramSizeGB);

System.out.println();
System.out.println(brand);
System.out.println(processor);
System.out.println(screenSize);
System.out.println(hasSSD);
System.out.println(ramSizeGB);

about();

}

public static void about(){
System.out.println( brand + " laptop is have " + processor + "processor);
}
}