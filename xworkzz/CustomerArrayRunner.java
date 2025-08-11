class CustomerArrayRunner {
	public static void main (String [] args){
		CustomerArray [] customer = new CustomerArray[2];
		
		CustomerArray customer1 = new CustomerArray();
		customer1.setCustomerName("Amogh");
		customer1.setAge(23);
		customer1.setWalletBalance(1500.00f);
		customer1.setHasOrderedBefore(false);
		customer1.setPreferredSize('A');
		
		customer[0]=customer1;
		
		CustomerArray customer2 = new CustomerArray();
		customer2.setCustomerName("Bhoomika");
		customer2.setAge(23);
		customer2.setWalletBalance(1200.00f);
		customer2.setHasOrderedBefore(true);
		customer2.setPreferredSize('B');
		
		customer[1]=customer2;
		
		for(int i=0;i<customer.length;i++){
			System.out.println("Customer=="+(i+1));
			CustomerArray localCustomer = customer[i];
			
			System.out.println(localCustomer.getCustomerName());
			System.out.println(localCustomer.getAge());
			System.out.println(localCustomer.getWalletBalance());
			System.out.println(localCustomer.getHasOrderedBefore());
			System.out.println(localCustomer.getPreferredSize());
			
			System.out.println(localCustomer.getCustomerName());
			System.out.println(localCustomer.getAge());
			System.out.println(localCustomer.getWalletBalance());
			System.out.println(localCustomer.getHasOrderedBefore());
			System.out.println(localCustomer.getPreferredSize());
		}
	}
}