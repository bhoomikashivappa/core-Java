class DecorationArray {
	
		private String topping ;
		private int candles;
		private float icingThickness ;
		private boolean hasSprinkles ;
		private char theme ;
		
		public void setTopping(String topping){
			this.topping=topping;
		}
		public void setCandles(int candles){
			this.candles=candles;
		}
		public void setIcingThickness(float icingThickness){
			this.icingThickness=icingThickness;
		}
		public void setHasSprinkles(boolean hasSprinkles){
			this.hasSprinkles=hasSprinkles;
		}
		public void setTheme(char theme){
			this.theme=theme;
		}
		public String getTopping(){
			return topping;
		}
		public int getCandles(){
			return candles;
		}
		public float getIcingThickness(){
			return icingThickness;
		}
		public boolean getHasSprinkles(){
			return hasSprinkles;
		}
		public char getTheme(){
			return theme;
		}

	
}