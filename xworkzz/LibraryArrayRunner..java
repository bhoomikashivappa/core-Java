class LibraryArrayRunner {
	public static void main(String [] args){
		LibraryArray [] library = new LibraryArray[5];
		
		LibraryArray library1 = new LibraryArray();
		library1.setBookCount(5);
		library1.setSection('A');
		library1.setIsOpen(true);
		
		for(int i=0;i<library.length;i++){
			if(i==0){
				library[0]==library1;
			}
		}
		
		for(int i+0;i<library.length;i++){
			LibraryArray localLibrary = library[i];
			if(localLibrary!=null){
				System.out.println(localLibrary.getBookCount());
				System.out.println(localLibrary.getSection());
				System.out.println(localLibrary.getIsOpen());
			}
		}
	}
}