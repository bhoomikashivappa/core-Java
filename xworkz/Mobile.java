class Mobile{


static  String name;
static int price;
static  String color;
static float validity;

public static void main (String[] args){

String  mobileName = nameOfMobile();
System.out.println(mobileName);

int mobilePrice = priceOfMobile();
System.out.println(mobilePrice);

String mobileColor = colorOfMobile();
System.out.println(mobileColor);

float mobileValidity = validityOfMobile();
System.out.println(mobileValidity);
}

public static String nameOfMobile(){
return name;
}

public static int priceOfMobile(){
return price;
}

public static String  colorOfMobile(){
return color;
}

public static float validityOfMobile(){
return validity;
}
}
