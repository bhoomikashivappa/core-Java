class Bag{

static String brandName;
static String color;
static boolean isWaterProof;
static double price;
static int capacity;

public static void main (String[] args){

String brandName= "SkyBags";
String color = "Black";
boolean isWaterProof = true;
double price = 1999.99;
int capacity = 10;
 
System.out.println();
System.out.println(Bag.brandName);
System.out.println(Bag.color);
System.out.println(Bag.isWaterProof);
System.out.println(Bag.price);
System.out.println(Bag.capacity);

System.out.println();
System.out.println(brandName);
System.out.println(color);
System.out.println(isWaterProof);
System.out.println(price);
System.out.println(capacity);

zips();
}
 
public static void zips(){
System.out.println(brandName + " have 3 zips with  "  + capacity + "Kg capacity we can carry ");
}

}