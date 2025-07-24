class ChairRunner { 

public static  void main (String[] args){

Chair chair1 = new Chair();
chair1.setType("Wood");
System.out.println("The chair type is : " + chair1.getType());

Chair chair2 = new Chair();
chair2.setType("Plastic");
System.out.println("The chair type is : " + chair2.getType());

Chair chair3 = new Chair();
chair3.setColor("Blue");
System.out.println("The chair color is : " + chair3.getColor());

Chair chair4 = new Chair();
chair4.setColor("Gold");
System.out.println("The chair color is : " + chair4.getColor());

Chair chair5 = new Chair();
chair5.setLegs(4);
System.out.println("The chair Legs are : " + chair5.getLegs());

Chair chair6 = new Chair();
chair6.setLegs(8);
System.out.println("The chair Legs are : " + chair6.getLegs());

Chair chair7 = new Chair();
chair7.setWeight(10.6f);
System.out.println("The chair weight is : " + chair7.getWeight());

Chair chair8 = new Chair();
chair8.setWeight(11.6f);
System.out.println("The chair weight is : " + chair8.getWeight());

Chair chair9 = new Chair();
chair9.setHasWheels(true);
System.out.println("The chair has wheels is : " + chair9.getHasWheels());

Chair chair10 = new Chair();
chair10.setHasWheels(false);
System.out.println("The chair has wheels is : " + chair10.getHasWheels());

}

}