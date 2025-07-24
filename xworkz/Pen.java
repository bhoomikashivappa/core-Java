class  Pen {

private  String brand;
private String color;
private float price;
boolean isGelPen;
String material;

Pen() {
}

public String getBrand(){
return brand;
}

public void setBrand(String penBrand){
brand = penBrand;
}

public String getColor(){
return color;
}

public void setColor(String penColor){
color = penColor;
}

public float getPrice(){
return price;
}

public void setPrice(float penPrice){
price = penPrice;
}

public boolean getIsGelPen(){
return isGelPen;
}

public void setIsGelPen(boolean penIsGel){
isGelPen = penIsGel;
}

public String getMaterial(){
return material;
}

public void setMaterial(String penMaterial){
material = penMaterial;
}

}