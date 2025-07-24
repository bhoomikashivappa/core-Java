class Restaurant{

//5 static variavles
static String name = "WOW MOM" ;
static String location = "MG Road";
static int totalTable = 10;
static boolean isOpen = false;
static float rating = 4.6f;



public static void main(String[] args){


// 5 Local variables with same names as static variables

String name = "Megana Biriyani";
String location = "Begaluru";
int totalTable= 39;
boolean isOpen = true;
float rating = 4.9f;


// Print local variables

System.out.println("Name : " + name);
System.out.println("Location : " + location);
System.out.println("Total Table : " + totalTable);
 System.out.println("Is Open : " + isOpen);
 System.out.println("Rating : " + rating );

System.out.println();
System.out.println();


// Print static variables using ClassName

System.out.println("Name : "+ Restaurant.name);
System.out.println("Location :"+Restaurant.location);
System.out.println("Total Table : "+Restaurant.totalTable);
System.out.println("Is Open : "+Restaurant.isOpen);
System.out.println("Rating : "+Restaurant.rating);

homeDelivery();
}

public static void homeDelivery(){
System.out.println();

System.out.println(name + "is available for homeDelivery  with in 10mits");
}
}