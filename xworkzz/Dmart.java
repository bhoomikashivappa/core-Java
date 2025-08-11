class Dmart {

static int storeSection = 10;            
static short storeNumber = 12;
static float discountRate = 18.75f;        
static int totalItems = 5000;
static int dailyCustomers = 1200;
static boolean isOpenToday = true;

public static float getDiscountAmount(float itemPrice){
float discount = (itemPrice*discountRate)/100;
return discount;  
}
}