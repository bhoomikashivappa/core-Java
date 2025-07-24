class LargestNumber{
	public static void main (String[] args){
		
		int a=10;
		int b=20;
		int c=40;
		
		if(a>b && a>c){
			System.out.println("a is grater " + a );
		} else if(b>c && b>a){
			System.out.println("b is grater " + b);
		} else {
			System.out.println("c is grater  " + c);
		}
		
	}
}