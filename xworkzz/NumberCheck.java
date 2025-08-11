class NumberCheck{
static int i ;

public static void main (String[] args){

for (int i =1; i<=100; i++){

if (i%2 ==0){
System.out.println("The Even number is" + i );
System.out.println();

} else{
System.out.println("Odd number is " + i);
System.out.println();

 
}

if (i% 3 == 0){
System.out.println("Divisible by 3 is :"+i);
System.out.println();

}

if (i%5 == 0){
System.out.println("Divisible by 5 is :" +i);
System.out.println();

}

}

}

}