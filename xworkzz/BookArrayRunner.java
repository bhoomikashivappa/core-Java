class BookArrayRunner{
	public static void main(String [] args){
		BookArray[] book = new BookArray[5];
		
		BookArray book1=new BookArray();
		book1.setTitle("ABCD");
		book1.setAuthor("PB");
		book1.setPages(120);
		
		BookArray book2=new BookArray();
		book2.setTitle("ABC");
		book2.setAuthor("PD");
		book2.setPages(150);
		
		BookArray book3=new BookArray();
		book3.setTitle("ABCFS");
		book3.setAuthor("PC");
		book3.setPages(180);
		
		
		
		for(int i=0;i<book.length;i++){
			if(i==0){
				book[i]=book1;
			}else if(i==1){
				book[i]=book2;
			}else if(i==2){
				book[i]=book3;
			}
		}
		
		for(int i=0;i<book.length;i++){
			BookArray localBook = book[i];
			if(localBook!=null){
				System.out.println(localBook.getTitle());
				System.out.println(localBook.getAuthor());
				System.out.println(localBook.getPages());
				System.out.println("-------------------");
			}
		}
	}
}