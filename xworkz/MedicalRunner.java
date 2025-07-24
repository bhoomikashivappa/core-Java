class MedicalRunner {

public static void main(String[] args){

int totalBill = Medical.getTotalBill( 500);
System.out.println(totalBill);

int totalPatients = Medical.getTotalPatients(20000);
System.out.println(totalPatients);

float dosage = Medical.getDosage();
System.out.println(dosage);

System.out.println(Medical.medicineCategory );


}
}