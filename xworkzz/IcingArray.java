class IcingArray {
    String type;
    char color ;
    String flavor ;
    char texture ;
    
	
	public void setType(String type){
		this.type=type;
	}
	public void setColor(char color){
		this.color=color;
	}
	public void setFlavor(String flavor){
		this.flavor=flavor;
	}
	public void setTexture(char texture){
		this.texture=texture;
	}
	public String getType(){
		return type;
	}
	public char getColor(){
		return color;
	}
	public String getFlavor(){
		return flavor;
	}
	public char getTexture(){
		return texture;
	}
}