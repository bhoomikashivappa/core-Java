class GoodBank {
	public static void main(String [] args){
		int[] accountNumbers = {101, 102};
		float[] interestRates = {3.5f, 4.0f};
		double[] balance = {50000.5, 60000.75};
		char[] accountType = {'S', 'C'};
		boolean[] isActive = {true, false};
		String[] holders = {"Raj", "Kiran"};
		short[] branchCode = {12, 34};
		long[] ifsc = {123456789012L};
		byte[] atmLimit = {50, 40};
		Object[] services = {"NetBanking", true, 24};
		
		for(int i=0;i<accountNumbers.length;i++){
			System.out.println(accountNumbers[i]);
		}
		for(int i=0;i<interestRates.length;i++){
			System.out.println(interestRates[i]);
		}
		for(int i=0;i<balance.length;i++){
			System.out.println(balance[i]);
		}
		for(int i=0;i<accountType.length;i++){
			System.out.println(accountType[i]);
		}
		for(int i=0;i<isActive.length;i++){
			System.out.println(isActive[i]);
		}
		for(int i=0;i<holders.length;i++){
			System.out.println(holders[i]);
		}
		for(int i=0;i<branchCode.length;i++){
			System.out.println(branchCode[i]);
		}
		for(int i=0;i<ifsc.length;i++){
			System.out.println(ifsc[i]);
		}
		for(int i=0;i<atmLimit.length;i++){
			System.out.println(atmLimit[i]);
		}
		for(int i=0;i<services.length;i++){
			System.out.println(services[i]);
		}
	}
}