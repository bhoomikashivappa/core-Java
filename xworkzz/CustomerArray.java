class CustomerArray {
	private String customerName ;
	private int age ;
	private float walletBalance ;
	private boolean hasOrderedBefore;
	private char preferredSize ;
	
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setWalletBalance(float walletBalance){
		this.walletBalance=walletBalance;
	}
	public void setHasOrderedBefore(boolean hasOrderedBefore){
		this.hasOrderedBefore=hasOrderedBefore;
	}
	public void setPreferredSize(char preferredSize){
		this.preferredSize=preferredSize;
	}
	public String getCustomerName(){
		return customerName;
	}
	public int getAge(){
		return age;
	}
	public float getWalletBalance(){
		return walletBalance;
	}
	public boolean getHasOrderedBefore(){
		return hasOrderedBefore;
	}
	public char getPreferredSize(){
		return preferredSize;
	}

}