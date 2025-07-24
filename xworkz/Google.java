class Google {

static char productCode = 'G';                 
static short officeCode = 101;
static float marketShare = 92.5f;
static int employeeCount = 180000;
static int foundedYear = 1998;
static boolean isHiring = true;

public static int getYearSinceFounded(int currentYear){
int yearSince = currentYear - foundedYear;
return yearSince;
}

}
