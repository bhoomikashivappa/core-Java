class LibraryArray {
	private int bookCount;
	private char section;
	private boolean isOpen;
	
	public void setBookCount(int bookCount){
		this.bookCount=bookCount;
	}
	public void setSection(char section){
		this.section=section;
	}
	public void setIsOpen(boolean isOpen){
		this.isOpen=isOpen;
	}
	public int getBookCount(){
		return bookCount;
	}
	public char getSection(){
		return section;
	}
	public boolean getIsOpen(){
		return isOpen;
	}
	
}