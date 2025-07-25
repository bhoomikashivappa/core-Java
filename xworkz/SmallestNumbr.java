class SmallestNumbr{
	public static void main(String[] args){
		int a=2;
		int b=4;
		int c=8;
		
		if(a<b && a<c){
			System.out.println("a is the small numbr" + a);
		} else if(b<a && b<c){
			System.out.println("b is the small numbr" + b);
		} else {
			System.out.println("C is small number " + c);
		}
	}
}