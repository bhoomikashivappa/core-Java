class Person {
	private String  name;
	private int age;
	
	public Person(String personName,int personAge){
		this.name= personName;
		this.age = personAge;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void validateEligibleForVoting(int age) {
	if(age>=18){
		System.out.println(name+" is eligible for voting.");
	}else {
		System.out.println(name+ " is not eligible for voting");
	}
	}
	
	public static void main(String [] args){
		Person person1 = new Person("Bhoomika",20);
		person1.validateEligibleForVoting(person1.getAge());
		
		Person person2= new Person("Amogh" , 16);
		person2.validateEligibleForVoting(person2.getAge());
	}
}