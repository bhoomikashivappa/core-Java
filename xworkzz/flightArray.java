class FlightArray {
	private int flightNumbers ;
    private float flightDuration ;
    private double ticketPrice;
	
	public void setFlightNumbers(int flightNumbers){
		this.flightNumbers=flightNumbers;
	}
	public void setFlightDuration(float flightDuration){
		this.flightDuration=flightDuration;
	}
	public void setTicketPrice(double ticketPrice){
		this.ticketPrice=ticketPrice;
	}
	public int getFlightNumbers(){
		return flightNumbers;
	}
	public float getFlightDuration(){
		return flightDuration;
	}
	public double getTicketPrice(){
		return ticketPrice;
	}
}
