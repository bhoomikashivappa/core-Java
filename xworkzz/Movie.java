class Movie{

static String name = "Apayavide Echarike";
static int time = 2;
static double rating = 4.9;

public static void main(String[] args){

String movieName = nameOfMovie();
System.out.println(movieName);

int movieTime = timeOfMovie();
System.out.println(movieTime);

double movieRating = ratingOfMovie();
System.out.println(movieRating);

}

public static String  nameOfMovie(){
return name;
}

public static int timeOfMovie(){
return time;
}

public static  double ratingOfMovie(){
return rating;
}
}