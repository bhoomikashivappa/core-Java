class Supermarket {

static int totalItemsSold = 1200;
static float averageItemPrice = 75.25f;
static int numberOfCustomers = 300;
static float discountRate = 10.0f;
static int openHours = 12;

public static float getTotalRevenueBeforeDiscount(){
float totalRevenue =  totalItemsSold  *averageItemPrice;
return totalRevenue ;

}

}