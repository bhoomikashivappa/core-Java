class WatchRunner { 

public static void main(String[] args){

Watch watch1 = new Watch();
watch1.setBrand("HMT");
System.out.println("Watch brand is : " + watch1.getBrand());

Watch watch2 = new Watch();
watch2.setBrand("Fastrack");
System.out.println("Watch brand is : " + watch2.getBrand());

Watch watch3 = new Watch();
watch3.setType("Belt");
System.out.println("Watch type is : " + watch3.getType());

Watch watch4 = new Watch();
watch4.setType("Chain");
System.out.println("Watch type is : " + watch4.getType());

Watch watch5 = new Watch();
watch5.setPrice(2000.2f);
System.out.println("Watch price is : " + watch5.getPrice());

Watch watch6 = new Watch();
watch6.setPrice(2600.2f);
System.out.println("Watch price is : " + watch6.getPrice());

Watch watch7 = new Watch();
watch7.setIsWaterResistant(true);
System.out.println("Watch Is Water Resistant  : " + watch7.getIsWaterResistant());

Watch watch8 = new Watch();
watch8.setIsWaterResistant(true);
System.out.println("Watch Is Water Resistant  : " + watch8.getIsWaterResistant());

Watch watch9 = new Watch();
watch9. setStrapMaterial("Leather");
System.out.println("Watch  Strap Material  is : " + watch9. getStrapMaterial ());

Watch watch10 = new Watch();
watch10. setStrapMaterial("Metal");
System.out.println("Watch  Strap Material  is : " + watch10. getStrapMaterial ());



}
}