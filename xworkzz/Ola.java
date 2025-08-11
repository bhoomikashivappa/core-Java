class Ola {

static char cabCategory = 'P';              
static short driverId = 102;
static float tripDistance = 12.5f;           
static int baseFare = 100;
static int costPerKm = 15;
static boolean isACAvailable = true;

public static int getTotalCost(int totalKm){
int totalCost= costPerKm*totalKm;
return totalCost;
}

}
