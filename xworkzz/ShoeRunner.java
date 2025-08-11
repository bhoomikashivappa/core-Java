class ShoeRunner {

public static void main(String [] args){

Shoe shoe1 = new Shoe();
shoe1.setBrand("ABC");
System.out.println("The Shoe brand is : " +shoe1.getBrand());

Shoe shoe2 = new Shoe();
shoe2.setBrand("ABC");
System.out.println("The Shoe brand is : " +shoe2.getBrand());

Shoe shoe3 = new Shoe();
shoe3.setSize(6);
System.out.println("The Shoe size is : " +shoe3.getSize());

Shoe shoe4 = new Shoe();
shoe4.setSize(4);
System.out.println("The Shoe size is : " +shoe4.getSize());

Shoe shoe5 = new Shoe();
shoe5.setColor("Red");
System.out.println("The Shoe color is : " +shoe5.getColor());

Shoe shoe6 = new Shoe();
shoe6.setColor("Blue");
System.out.println("The Shoe color is : " +shoe6.getColor());

Shoe shoe7 = new Shoe();
shoe7.setPrice(700.50f);
System.out.println("The Shoe price is : " +shoe7.getPrice());

Shoe shoe8 = new Shoe();
shoe8.setPrice(700.50f);
System.out.println("The Shoe price is : " +shoe8.getPrice());

Shoe shoe9 = new Shoe();
shoe9.setIsSportsShoe(true);
System.out.println("The Shoe price is : " +shoe9.getIsSportsShoe());

Shoe shoe10 = new Shoe();
shoe10.setIsSportsShoe(false);
System.out.println("The Shoe price is : " +shoe10.getIsSportsShoe());



}

}