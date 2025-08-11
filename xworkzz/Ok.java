class Ok{
public static void main(String[] args){
subtraction(10,40);
}

public static void subtraction(){
System.out.println("With out argument");
int  x=40;
int y=50;
int z=x-y;
System.out.println(z);
}

public static void subtraction(int x, int y){
System.out.println("With  argument");
int z=x-y;
System.out.println(z);
}
}