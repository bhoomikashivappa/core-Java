class College {

static String collegeName = "Pesitm";
static String location = "Shivamogga";
static double rating = 4.5;
static boolean  vtuClg = true;
static int csStudents = 50;
static int aimlStudents = 40;


public static int getTotalStudentsInCollege(){
int totalStudents = csStudents + aimlStudents;
return totalStudents;
}

public static String locationOfCollege(){
return location;
}

public static String getcollegeName(){
return collegeName;
}

public static double getRatingOfCollege(){
return rating;
}

public static boolean getVtuClg(){
return vtuClg;
}

}
