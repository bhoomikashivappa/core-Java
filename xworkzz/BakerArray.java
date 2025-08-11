class BakerArray{
	private String name ;
	private int experienceInYears ;
	private float rating ;
	private boolean isAvailable ;
	private char gender;
	
	public void setName(String name){
		this.name=name;
	}
	public void setExperienceInYears(int experienceInYears){
		this.experienceInYears=experienceInYears;
	}
	public void setRating(float rating){
		this.rating=rating;
	}
	public void setIsAvailable(boolean isAvailable){
		this.isAvailable=isAvailable;
	}
	public void setGender(char gender){
		this.gender=gender;
	}
	public String getName(){
		return name;
	}
	public int getExperienceInYears(){
		return experienceInYears;
	}
	public float getRating(){
		return rating;
	}
	public boolean getIsAvailable(){
		return isAvailable;
	}
	public char getGender(){
		return gender;
	}
	

}