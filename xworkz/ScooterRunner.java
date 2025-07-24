class ScooterRunner {


public static void main (String[] args){

System.out.println(Scooter.scooterSeries );
System.out.println(Scooter.scooterNumber );

int totalPrice;
totalPrice = Scooter.getTotalPrice(10);
System.out.println(totalPrice);

int totalAmount = Scooter.totalAmountInTrip();
System.out.println(totalAmount);
}

}