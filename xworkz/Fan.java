class Fan{

static String name = "Usha";
static char color; 
static int price = 2200 ;
static boolean  remote = true;
static double  speed= 1800.5d;
static float rating=4.8f; 


public static void main (String[] args){
System.out.println(color);
carry();
available();
quality();
}

public static void carry(){
System.out.println("Yes the  " + name + " fan " + " price " + " is "+ price + "Rs with remote and speed of  " + speed);
System.out.println( );
}

public static void available(){
System.out.println("they provide remote for this fan : "+ remote);
System.out.println( );
}

public static void quality(){
System.out.println("this fan is 5 star with "+ rating + " rating");
}
}
