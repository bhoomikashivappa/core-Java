class Game { 

String title;
String genre;
String developer;
float rating;
boolean isMultiplayer;

Game(){
}

public static void main (String [] args){

Game game1 =new Game();
game1.title= "Call of Duty";
System.out.println("Game title is : " + game1.title);

game1.setTitle("Minecraft");
System.out.println("Game title is: " + game1.title);

Game game2 =new Game();
game2.genre = "Shooter";
System.out.println("Game genre is : " + game2.genre);

game2.setGenre("Sandbox");
System.out.println("Game genre is : " + game2.genre);

Game game3 = new Game();
game3.developer = "Infinity Ward";
System.out.println("Game developer is : " + game3.developer);

game3.setDeveloper ("Mojang Studios");
System.out.println("Game developer is : " + game3.developer);

Game game4= new Game();
game4.rating = 4.5f;
System.out.println("Game rating is : " + game4.rating);

game4.setRating (4.7f);
System.out.println("Game rating is : " + game4.rating);

Game game5 =new Game();
game5.isMultiplayer = true;
System.out.println("Game is Multiplayer : " + game5.isMultiplayer);

game5.setIsMultiplayer (true);
System.out.println("Game is Multiplayer : " + game5.isMultiplayer);

}

public void setTitle(String gameTitle){
title = gameTitle;
}

public void setGenre(String gameGenre){
genre = gameGenre;
}

public void setDeveloper(String gameDeveloper){
developer = gameDeveloper;
}

public void setRating(float gameRating){
rating = gameRating;
}

public void setIsMultiplayer(boolean gameIsMultiplayer ){
isMultiplayer = gameIsMultiplayer ;
}
}
