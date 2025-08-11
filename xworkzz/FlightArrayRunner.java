class FlightArrayRunner {
	public static void main (String [] args){
		FlightArray [] flight = new FlightArray[5];
		
		FlightArray flight1 = new FlightArray();
		flight1.setFlightNumbers(2);
		flight1.setFlightDuration(2.2f);
		flight1.setTicketPrice(25000.0);
		
		for(int i=0;i<flight.length;i++){
			if(i==0){
				flight[0]=flight1;
			}
		}
		
		for(int i=0;i<flight.length;i++){
			FlightArray localFlight = flight[i];
			if(localFlight!=null){
				System.out.println(flight1.getFlightNumbers());
				System.out.println(flight1.getFlightDuration());
				System.out.println(flight1.getTicketPrice());
			}
		}
	}
}