class Copy {
	public static void main(String [] args){
		int [] intArray = new int[3];
		short [] shortArray = new short[4];
		long [] longArray = new long[2];
		byte[] byteArray = new byte[3];
		float [] floatArray = new float[10];
		double [] doubleArray = new double[3];
		boolean [] booleanArray = new boolean[3];
		char [] charArray = new char[3];
		
		/*
		intArray = new int[]{2,3,4};
		shortArray = new short[]{1,2,3,4};
		longArray = new long[]{9,8};
		byteArray = new byte[]{0,1,2};
		floatArray = new float[]{1,3,5,7};
		doubleArray = new double[]{66,77,88};
		booleanArray = new boolean[]{true,false,true};
		charArray = new char[]{'A','B','C'};
		
		for(int i=0;i<intArray.length;i++){
			System.out.println("")
		}*/
		
		for(int i=0;i<floatArray.length;i++){
			floatArray[i]=i+2;
		}
		System.out.println("Before copying elements===");
		for(int i=0;i<floatArray.length;i++){
			System.out.println(floatArray[i]);
		}
		float[] copyingArray = new float[floatArray.length];
		for(int i=0;i<floatArray.length;i++){
			copyingArray[i]=floatArray[i];
		}
		System.out.println("After copying elements===");
		for(int i=0;i<copyingArray.length;i++){
			System.out.println(copyingArray[i]);
		}
		
		intArray=new int[]{1,2,3};
		System.out.println("Before copying elements===");
		for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]);
		}
		int[] copyingIntArray = new int[intArray.length];
		for(int i=0;i<intArray.length;i++){
			copyingIntArray[i]=intArray[i];
		}
		System.out.println("After copying elements===");
		for(int i=0;i<copyingIntArray.length;i++){
			System.out.println(copyingIntArray[i]);
		}
	}
}