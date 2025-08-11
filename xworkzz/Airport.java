class Airport {

String name;
String city;
int terminals;
int runways;
boolean isInternational;

Airport (){
}

public static void main(String [] args){

Airport airport1  = new Airport ();
airport1.name = "Kempegowda International Airport";
System.out.println("The airport name is : " +airport1.name);

airport1.setName("Chhatrapati Shivaji Maharaj Airport");
System.out.println("The airport name is :" + airport1.name);
System.out.println();



Airport airport2 = new Airport();
airport2.city= "Bengaluru";
System.out.println("The airport city is : " + airport2.city);

airport2.setCity("Mumbai");
System.out.println("The airport city is : " + airport2.city);
System.out.println();


Airport airport3 = new Airport();
airport3.terminals = 2;
System.out.println("The terminals are : " + airport3.terminals);

airport3.setTerminals(3);
System.out.println("The terminals are : " + airport3.terminals);
System.out.println();


Airport airport4 = new Airport();
airport4.runways = 2;
System.out.println("The number os runWays : " + airport4.runways);

airport4.setRunways(3);
System.out.println("The number os runWays : " + airport4.runways);
System.out.println();


Airport airport5 = new Airport();
airport5. isInternational = true;
System.out.println("The airport is  International : " +  airport5. isInternational); 

airport5. setIsInternational(true);
System.out.println("The airport is  International : " +  airport5. isInternational);
System.out.println();
 


}

public void setName(String airportName){
name = airportName;
}

public void setCity (String airportCity){
city = airportCity;
}

public void setTerminals(int airportTerminals){
terminals = airportTerminals;
}

public void setRunways(int airportRunways){
runways= airportRunways;
 }

public void setIsInternational(boolean airportIsInternational){
isInternational = airportIsInternational;
}

}