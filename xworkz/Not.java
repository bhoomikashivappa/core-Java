class Not{
public static void main(String[] args){
multiplication(10,5);
}

public static void multiplication(){
System.out.println("With out argument");
int a= 5;
int b=2;
int c= a*b;
System.out.println(c);
}

public static void multiplication(int a, int b){
System.out.println("With argument");
int c= a*b;
System.out.println(c);
}
}