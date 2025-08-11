class Train{

static int totalCoaches = 20;
static int seatsPerCoach = 72;
static int ticketPrice = 150;
static float fuelCostPerKm = 58.75f;
static int totalDistance = 500;

public static int  getTotalSeatsInTrain(){
int totalSeats = totalCoaches *seatsPerCoach;
return totalSeats;

}
}