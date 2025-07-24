class PenRunner{

public static void main (String[] args){

Pen pen1 = new Pen();
pen1.setBrand("acc");
System.out.println("Pen Brand is : " + pen1.getBrand());

Pen pen2= new Pen();
pen2.setBrand("XYZ");
System.out.println("Pen Brand is : " + pen2.getBrand());

Pen pen3 = new Pen();
pen3.setColor("Black");
System.out.println("Pen Color is : " + pen3.getColor());

Pen pen4 = new Pen();
pen4.setColor("Red");
System.out.println("Pen Color is : " + pen4.getColor());

Pen pen5 = new Pen();
pen5.setPrice(5.5f);
System.out.println("Pen Price is : " + pen5.getPrice());

Pen pen6 = new Pen();
pen6.setPrice(10.0f);
System.out.println("Pen price is : " + pen6.getPrice());

Pen pen7 = new Pen();
pen7.setIsGelPen(true);
System.out.println("Pen is Gel : " + pen7.getIsGelPen());

Pen pen8 = new Pen();
pen8.setIsGelPen(false);
System.out.println("Pen is Gel : " + pen8.getIsGelPen());

Pen pen9 =new Pen();
pen9. setMaterial("Wood");
System.out.println("Pen material is : " + pen9 . getMaterial());

Pen pen10 = new Pen();
pen10. setMaterial("Plastic" );
System.out.println("Pen material is : " + pen10.getMaterial());




}

}