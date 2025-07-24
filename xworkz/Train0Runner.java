class Train0Runner {

static {
System.out.println("Static Block");
}

public static void main(String[] args){

Train0 train1 = new Train0();
System.out.println(Train0.length);
System.out.println(train1.getName());

Train0 train2 = new Train0();
train2.setName("Shathabdi");
System.out.println(train2.getName());


}

}