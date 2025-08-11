class GirlsPg {

static char pgBlock = 'B';
static short roomNumber = 2;
static float monthlyRent = 7500.50f;
static int totalRooms = 40;
static int totalGirls = 85;
static boolean hasWiFi = true;

public static double getTotalAmountOfRent(){
double totalAmount = totalGirls * monthlyRent;
return totalAmount;
}
}