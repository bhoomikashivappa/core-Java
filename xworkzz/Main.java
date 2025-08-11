class Main{
public static void main (String[]  args){
addition(20,40);
}

public static void addition(){
System.out.println("With out argument");
int a=10;
byte b=127;
int c= a+b;
System.out.println(c);
}

public static void addition(int a,int b){
System.out.println("With  argument");
int c=a+b;
System.out.println(c);
}
}