class Company{
    private String name ;
    private int id;
    private String city;
    private int numberOfEmployees;
    private Ceo ceo;

    public Company(String name, int id, String city, int Num){
        this.name = name;
        this.id = id;
        this.city = city;
        numberOfEmployees = Num;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void setCeo(Ceo ceo ){
        this.ceo = ceo;
    }

    public Ceo getCeo(){
        return ceo;
    } 

}