class Theatre {

static int numberOfSeats = 150;
static int showsPerDay = 5;
static int ticketPrice = 200;
static float occupancyRate = 85.5f; 
static int snacksPerShow = 300;

public static int getTotalCollectionOfOneShow(){
int totalCollection = numberOfSeats * ticketPrice;
return totalCollection ;
}

}