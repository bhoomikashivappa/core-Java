class LargestNumb{
	public static void main (String[] args){
		int [] num = {2,4,6,8};
		
		int largest = num[0];
		
		for(int i=0;i<num.length;i++){
			if(num[i]>largest){
				largest=num[i];
			}
		}
		System.out.println("The largest number is: " + largest);
	}
}