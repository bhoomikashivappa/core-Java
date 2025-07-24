class RoomRunner {

public static void main (String [] args){

Room room1 = new Room();
room1.setColor("Red");
System.out.println("Room color is : " + room1.getColor());

Room room2 = new Room();
room2.setColor("white");
System.out.println("Room color is : " + room2.getColor());

Room room3 = new Room();
room3.setWindows(2);
System.out.println("Room windows is : " + room3.getWindows());

Room room4 = new Room();
room4.setWindows(1);
System.out.println("Room windows is : " + room4.getWindows());

Room room5 = new Room();
room5.setLength(25.5f);
System.out.println("Room length  is : " + room5.getLength());

Room room6 = new Room();
room6.setLength(26.5f);
System.out.println("Room length  is : " + room6.getLength());

Room room7 = new Room();
room7.setWidth(23.5f);
System.out.println("Room width  is : " + room7.getWidth());

Room room8 = new Room();
room8.setWidth(24.5f);
System.out.println("Room width  is : " + room8.getWidth());

Room room9 = new Room();
room9.setHasAC(true);
System.out.println("Room has AC  is : " + room9.getHasAC());

Room room10 = new Room();
room10.setHasAC(false);
System.out.println("Room has AC  is : " + room10.getHasAC());

}

}