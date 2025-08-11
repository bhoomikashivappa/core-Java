class CompanyCeoRunner{
    public static void main(String[] args){

        Company c1 = new Company("FoodDilivaries", 2121, "Kolar", 300);
System.out.println("company details");
        System.out.println(c1.getName());
        System.out.println(c1.getId());
        System.out.println(c1.getCity());
        System.out.println(c1.getNumberOfEmployees());

        Ceo ce = new Ceo("Thanushree", 200000.0f, "Kolar");

        c1.setCeo(ce);

        Ceo ceo = c1.getCeo();
System.out.println("ceo details");
        System.out.println(ceo.getName());
         System.out.println(ceo.getCity());
          System.out.println(ceo.getSalary());
        
        

        
    }

}