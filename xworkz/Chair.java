class Chair {

private String type;
private String color;
private int legs;
float weight;
boolean hasWheels;

Chair() {
} 

public void setType(String cType){
type = cType;
}

public String getType (){
return type;
}

public void setColor(String cColor){
color = cColor;
}

public  String getColor(){
return color;
}

public void setLegs(int cLegs){
legs = cLegs;
}

public int getLegs(){
return legs;
}

public void setWeight(float cWeight){
weight = cWeight;
}

public float getWeight(){
return weight ;
}

public void setHasWheels(boolean cHasWheels){
hasWheels = cHasWheels;
}

public boolean getHasWheels(){
return hasWheels;
}

}