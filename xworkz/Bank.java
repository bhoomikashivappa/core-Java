class Bank {

String name;
String branch;
int numberOfAccounts;
float interestRate;
boolean isNationalized;

Bank() {
}
public static void main (String[] args){

Bank bank = new Bank();
bank.name = "SBI";
System.out.println("The name of the bank is : " + bank.name);

bank.setName("Canara");
System.out.println("The name of the bank is : " + bank.name);


Bank bank1 = new Bank();
bank1.branch = "BTM Layout Branch";
System.out.println("The branch of the bank is : " + bank1.branch);


bank1.setBranch("Mg Road Branch");
System.out.println("The name of tha Brankch is : " + bank1.branch);

Bank bank2 = new Bank();
bank2.numberOfAccounts = 2;
System.out.println("The number of Acct in a bank : " + bank2.numberOfAccounts);

bank2.setNumberOfAccounts(3);
System.out.println("The number of Acct in a bank : " + bank2.numberOfAccounts);


Bank bank3 = new Bank();
bank3.interestRate = 12345.0f;
System.out.println("The interest Rate in this bank :" + bank3.interestRate);

bank3.setInterestRate (22.2f);
System.out.println("The interest Rate in this bank :" + bank3.interestRate);


Bank bank4= new Bank();
bank4.isNationalized = true;
System.out.println(" This bank is Nationalized : " + bank4.isNationalized);

bank4.setIsNationalized(false);
System.out.println(" This bank is Nationalized : " + bank4.isNationalized);

}

public void setName (String bankName){
name = bankName;
}

public void setBranch(String bankBranch){
branch = bankBranch;
}

public void setNumberOfAccounts(int bankAccnt){
numberOfAccounts = bankAccnt;
}

public void setInterestRate (float bankInterestRate  ){
interestRate = bankInterestRate ;
}

public void setIsNationalized(boolean bankIsNationalized){
isNationalized = bankIsNationalized;
}
}