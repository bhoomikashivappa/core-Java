class About {

    public int getAge() {
        return 21;
    }

    public double getPrice() {
        return 99.99;
    }

    public String getName() {
        return "Bhoomika";
    }

    public boolean isAvailable() {
        return false;
    }

    public char getGrade() {
        return 'A';
    }

  
    public String getStudentInfo() {
        return "jenu, 21";
    }

    public static void main(String[] args) {
        About a = new About();

        System.out.println(a.getAge());
        System.out.println(a.getPrice());
        System.out.println(a.getName());
        System.out.println(a.isAvailable());
        System.out.println(a.getGrade());

                System.out.println();

        System.out.println(a.getStudentInfo());
    }
}