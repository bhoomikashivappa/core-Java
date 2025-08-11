class FourthTable{
	public static void main (String [] args){
		int[] fourthTable = new int[10];
		
		for(int i=0;i<fourthTable.length;i++){
			fourthTable[i]=4*(i+1);
		}
		System.out.println("4'th table is : " );
		for(int i=0;i<fourthTable.length;i++){
		System.out.println(fourthTable[i]);
		}
	}
}