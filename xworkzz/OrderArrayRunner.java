class OrderArrayRunner {
	public static void main(String [] args){
		OrderArray [] order = new OrderArray[2];
		
		OrderArray order1 = new OrderArray();
		order1.setOrderId("K202507");
		order1.setQuantity(3);
		order1.setTotalAmount(200.00f);
		order1.setIsDelivered(true);
		order1.setDeliverySlot('A');
		
		order[0]=order1;
		
		OrderArray order2 = new OrderArray();
		order2.setOrderId("CK202507");
		order2.setQuantity(4);
		order2.setTotalAmount(3000.00f);
		order2.setIsDelivered(false);
		order2.setDeliverySlot('B');
		
		order[1]=order2;
		
		for(int i=0;i<order.length;i++){
			System.out.println("Order===="+(i+1));
			OrderArray localOrder = order[i];
			
			System.out.println(localOrder.getOrderId());
			System.out.println(localOrder.getQuantity());
			System.out.println(localOrder.getTotalAmount());
			System.out.println(localOrder.getIsDelivered());
			System.out.println(localOrder.getDeliverySlot());
			
		}
		
	}
}