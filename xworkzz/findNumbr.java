class findNumbr {
	public static void main(String [] args){
		byte [] byteArray = new byte[5];
		short [] shortArray = new short[2];
		int [] intArray = new int[8];
		long [] longArray = new long[8];
		float [] floatArray = new float[4];
		double [] doubleArray = new double[8];
		char [] charArray = new char[2];
		boolean [] booleanArray = new boolean[2];
		
		byteArray = new byte[]{1,2,3,4,5};
        shortArray = new short[]{10, 20};
        intArray = new int[]{100, 200, 300, 400, 500,600,700,800};
		longArray = new long[]{2,4,6,8,10,12,14,16};
		floatArray = new float[] {10,20,30,40};
		doubleArray = new double[] {1,2,3,4,5,6,7,8};
		charArray = new char[] {'A','B'};
		booleanArray = new boolean[] {true,true};
		
		
		byte target = 3; 
		short point = 20;
		int x = 400;
		long y = 14;
		float z = 30;
		double a=6;
		char b= 'A';
		boolean c = true;
		
		for(int i=0;i<byteArray.length;i++){
			if(byteArray[i]== target){
			System.out.println( "Number found " + target + " in index of " + i);
			}	
		}
		for (int i=0;i<booleanArray.length;i++){
			if(booleanArray[i]==c){
				System.out.println("Number found " + c + " in index of " + i);
			}
		}
		for(int i=0;i<shortArray.length;i++){
			if(shortArray[i]==point){
				System.out.println("Number found " + point + " in index of " + i);
			}
		}
		for(int i=0;i<intArray.length;i++){
			if(intArray[i]==x){
				System.out.println("Number found " + x + " in index of " + i);
			}
		}
		for(int i=0;i<longArray.length;i++){
			if(longArray[i]==y){
				System.out.println("Number found " + y + " in index of " + i);
			}
		}
		for(int i=0;i<floatArray.length;i++){
			if(floatArray[i]==z){
				System.out.println("Number found " + z + " in index of " + i);
			}
		}
		for(int i=0;i<doubleArray.length;i++){
			if(doubleArray[i]==a){
				System.out.println("Number found " + a + " in index of " + i);
			}
		}
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]==b){
				System.out.println("Number found " + b + " in index of " + i);
			}
		}
	}
}