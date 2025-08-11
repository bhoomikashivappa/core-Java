class BakeryArray{
    private String name ;
    private float rating ;
    private String specialty ;
    private char openDay ;
    
	public void setName(String name){
		this.name=name;
	}
	public void setRating(float rating){
		this.rating=rating;
	}
	public void setSpecialty(String specialty){
		this.specialty=specialty;
	}
	public void setOpenDay(char openDay){
		this.openDay=openDay;
	}
	public String getName(){
		return name;
	}
	public float getRating(){
		return rating;
	}
	public String getSpecialty(){
		return specialty;
	}
	public char getOpenDay(){
		return openDay;
	}
}