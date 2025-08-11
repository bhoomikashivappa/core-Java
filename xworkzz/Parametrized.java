class Parametrized {

	private String name;
	private int age;
	
	
	
	public Parametrized(String name) {
	 this.name = name;
	
	}
	public Parametrized(String name, int age) {
	 this.name = name;
	 this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
	
	Parametrized para = new Parametrized("Bhoomika");
	System.out.println(para.getName());
	
	
	
	}
	
   

}