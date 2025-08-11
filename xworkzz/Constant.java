class Constant {

static final float PIE = 3.14F;
static int i;

static {
System.out.println("Static Block");
}

public static void main(String[] args){
System.out.println(PIE);

for (int i=0; i<= 100; i++){
System.out.println(i);
}

boolean available = false;
if(i>100){
System.out.println("Executing if Statement");

} else {
System.out.println("Not executing if Condition is false");

}

}
}