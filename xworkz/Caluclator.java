class Caluclator {
	public static void main (String [] args){
		
		int a=20;
		int b = 30;
		int result = a+b;
		char operator = '+';
		if(operator == '+'){
			System.out.println("a + b ="+ result);
		} else if(operator == '-'){
			System.out.println("a + b ="  + (a-b));
		} else if(operator == '*'){
			System.out.println("a + b =" +(a*b) );
		} else if(operator == '%'){
			System.out.println("a % b =" +(a%b) );
		} else if(operator == '/'){
			System.out.println("a / b =" +(a/b) );
		} else {
			System.out.println("invalid operator" );
		}
		
	}
}