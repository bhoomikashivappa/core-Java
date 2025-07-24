class ItCompany {

static String cmpName;
static String location;
static boolean isHiring ;
static int numbEmpy;
static float cmpRating;

public static void main (String[] args){

String cmpName = "Microsoft" ;
String location = "BTM";
boolean isHiring = true ;
int numbEmpy = 2000;
float cmpRating=7.8f;

System.out.println();
System.out.println();
System.out.println("Company name : "+ ItCompany.cmpName);
System.out.println("Company location: " + ItCompany.location);
System.out.println("Company is Hiring at present :" + ItCompany.isHiring);
System.out.println("Number of Employee in company :" + ItCompany.numbEmpy);
System.out.println("Company rating :" + ItCompany.cmpRating);
System.out.println();
System.out.println();


System.out.println(cmpName);
System.out.println(location);
System.out.println(isHiring);
System.out.println(numbEmpy);
System.out.println(cmpRating);

onCampus();


}

public static void onCampus(){
System.out.println();
}

}