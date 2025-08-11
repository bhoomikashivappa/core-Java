class   Car{

static String name = "xc90 ";
static  int price = 220000;
static float mileage = 30000.45f;`
static String color ="RED";
static String company = "Volva";

public static void main(String[] args){



String carName = nameOfCar();
System.out.println(carName);

int carPrice= priceOfCar();
System.out.println(carPrice);

float carMileage= mileageOfCar();
System.out.println(carMileage);

String carColor= colorOfCar();
System.out.println(carColor);

String carCompany = companyOfCar();
System.out.println(carCompany);


}
public static String nameOfCar(){
return name;

}
public static int priceOfCar(){
return price;
}

public static float mileageOfCar(){
return mileage;
}

public static String colorOfCar(){
return color;
}

public static String companyOfCar(){
return company;
}

}