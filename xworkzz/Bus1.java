class Bus1{

static String name;
static String color;
static int speed=50;
static boolean stock;

public static void main (String[] args){
name ="Maruti";
System.out.println(name);
System.out.println(color);
System.out.println(speed);

drive();
Bus1.drive();
System.out.println(Bus1.name);
System.out.println(stock);


}

public static void  drive(){

System.out.println("the"+ name+ "Bus" +"is driving with a " + speed+ "km/hr");
}

}