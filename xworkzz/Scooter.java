class Scooter {

static char scooterSeries ='A';
static short scooterNumber =146;
static float mileage = 16.90f;
static int price =400000;
static int numberOfPassenger = 20;
static int ticketPrice=15;


public static int getTotalPrice(int numberOfBuses){
int totalPrice = price* numberOfBuses;
return totalPrice;

}

public static int totalAmountInTrip(){
int totalAmount = numberOfPassenger*ticketPrice;
return   totalAmount;
}

}