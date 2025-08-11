class Resort{

static int numberOfRooms = 120;
static int guestsPerRoom = 2;
static float roomRatePerNight = 4500.75f;
static int totalNightsStayed = 3;
static float discountPercentage = 10.0f;

public static int getTotalguestCapacity(){
int guestCapacity = guestsPerRoom * numberOfRooms;
return guestCapacity;
}
}