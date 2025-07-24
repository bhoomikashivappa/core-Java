class Dog {

static String name="Golden Retriever";
static int price= 20000;
static byte age= 3;
static String color = "Gold";

public static void main(String[] args){

String dogName= nameOfDog();
System.out.println(dogName);

int dogPrice =priceOfDog();
System.out.println(dogPrice);

byte dogAge = ageOfDog();
System.out.println(dogAge);

String dogColor = colorOfDog();
System.out.println(dogColor);
}

public static String nameOfDog(){
return name;
}

public static int priceOfDog(){
return price;
}

public static byte ageOfDog(){
return age;
}

public static String  colorOfDog(){
return color;
}

}

