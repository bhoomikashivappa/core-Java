class GameArrayRunner {
	public static void main(String [] args){
		GameArray [] game = new GameArray[5];
		
		GameArray game1 = new GameArray();
		game1.setLevel(30);
		game1.setName("SubWay");
		game1.setRating(4.5f);
		
		for(int i=0;i<game.length;i++){
			if(i==0){
				game[0]=game1;
			}
		}
		
		for(int i=0;i<game.length;i++){
			GameArray localGame = game[i];
			if(localGame!=null){
				System.out.println(localGame.getLevel());
				System.out.println(localGame.getName());
				System.out.println(localGame.getRating());
				
			}
		}
	}
}