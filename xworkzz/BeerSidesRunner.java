class BeerSidesRunner {
	public static void main(String[] args){
		Beer beer1 = new Beer("ot",50.00,500.00f,90.00f);
		
		Sides sides = new Sides("chips",50,200.00F);
		beer1.setSideItem(sides);
		
		System.out.println("beer details======================");
		System.out.println(beer1.getBrand());
		System.out.println(beer1.getAlcoholContent());
		System.out.println(beer1.getPrice());
		System.out.println(beer1.getVolem());
		System.out.println("-----------------------------------");
		
		Sides sides1 = beer1.getSideItem();
		System.out.println("Beer Sides details=================");
		System.out.println(sides1.getItemName());
		System.out.println(sides1.getQuantity());
		System.out.println(sides1.getPrice());
		System.out.println("-----------------------------------");
	}
}