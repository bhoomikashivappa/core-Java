class Medical {

static char medicineCategory = 'A';
static short medicineCode = 101;
static float dosage = 250.5f;
static int unitPrice = 50;
static int dailyPatients = 100;
static int consultationFee = 300;

public static int getTotalBill(int numberOfUnit){
int totalBill = unitPrice*numberOfUnit;
return totalBill;
}

public static int getTotalPatients(int numberOfPatientsInMonth){
int totalPatients = dailyPatients*numberOfPatientsInMonth;
return totalPatients;
}

public static float getDosage(){
return dosage;
}

}