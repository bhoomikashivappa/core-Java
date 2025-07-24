class  Book{

static String author = "Kuvempu";
static  String title = "Ramayana Darshanam";
static double price = 50.5;
static int chapter = 2;

public  static void main (String[] args){

String bookAuthor = authorOfBook();
System.out.println(bookAuthor);

String bookTitle = titleOfBook();
System.out.println(bookTitle);

double bookPrice = priceOfBook();
System.out.println(bookPrice);

int bookChapter = chapterOfBook();
System.out.println(bookChapter);
}

public static String  authorOfBook(){
return author;
}

public static String titleOfBook(){
return title;
}

public static double priceOfBook(){
return price;
}

public static int chapterOfBook(){
return chapter;
}
}