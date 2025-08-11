class Corn{

static String type;
static String origin;
static double weightInKg;
static boolean isOrganic;
static int calories;

public static void main(String[] args){

String type="Sweet Corn";
String origin =" Karnataka";
double weightInKg= 1.2;
boolean isOrganic = true;
int calories = 96;

System.out.println();
System.out.println(Corn.type);
System.out.println(Corn.origin);
System.out.println(Corn.weightInKg);
System.out.println(Corn.isOrganic);
System.out.println(Corn.calories);

System.out.println();
System.out.println(type);
System.out.println(origin);
System.out.println(weightInKg);
System.out.println(isOrganic);
System.out.println(calories);

food();
}

public static void food(){
System.out.println(type + " is from " + origin);
}
}