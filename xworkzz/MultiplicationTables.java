class  MultiplicationTables {

public static void main(String [] args){

for (int i = 3; i<=9; i+=3){
System.out.println("Multiplication Table for " + i);

for(int j=1; j<=10; j++){
System.out.println(i + " * " + j + " = " + (i* j));
}
System.out.println();
}
}
}