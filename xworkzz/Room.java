class  Room {

private String color;
private int windows;
float length;
float width;
boolean hasAC;

Room() {
}

public void setColor(String rColor){
color = rColor;
}

public String getColor(){
return color;
}

public void setWindows(int rWindows){
windows = rWindows;
}

public int getWindows(){
return windows;
}

public void setLength(float rLength){
length = rLength;
}

public float getLength(){
return length;
}

public void setWidth(float rWidth){
width = rWidth;
}

public float getWidth(){
return width;
}

public void setHasAC(boolean rHasAC){
hasAC = rHasAC;
}

public boolean getHasAC(){
return hasAC;
}

}


