class Example {
	public static void main (String[] args){
		int a = 10;
		for(int i=1; i<=10; i++){
			if(i%2==0){
				System.out.println("Even number "+ i);
				System.out.println("");
			} else if (i%3==0) {
				System.out.println("Divisibel by 3 " +i);
				System.out.println("");
			} else if (i%4 == 0){
				System.out.println("Divisibel by 4 " +i);
				System.out.println("");
			}else if(i%2!=0){
				System.out.println("odd numbers " +i);
				System.out.println("");
			}else{
				System.out.println("Does not match with any contains");
			}
		}
		
		int b=1;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("While loop ");
		while (b<=5){
			System.out.println("value of j is : " +b);
			b++;
		}
		
		int k=6;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Do while loop");
		do{
			System.out.println("k value is : " + k);
			k++;
		}while(k<=10);
				
		
		
		
	}
}