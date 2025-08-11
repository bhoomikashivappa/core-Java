class FindNumberInArray{
	public static void main (String [] args){
		int  array[] = {10,30,40,20,90};
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		int num=90;
		for(int i=0;i<array.length;i++){
			if(array[i] == num){
				System.out.println("Element found " +num + " at index " + i);
			}
		}
	}
}