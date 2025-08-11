class LapTop1 {

String name;


//default constructor // no argument constructor 
public LapTop1() {

}

public static void main(String[] args){

LapTop1 laptop = new LapTop1();              //classname variable name = new classname();    //constructor 
laptop.name = "Lenovo";

//laptop.setName("Lenovo");
System.out.println(laptop.name);

laptop.setName("HP");
System.out.println(laptop.name);

LapTop1 laptop2 = new LapTop1();
laptop2.name = "Dell";
System.out.println(laptop2.name);

}

public void setName(String laptopName){
name = laptopName;
}
}