class Conversion{
public static void main(String[] args){

String  str1 = "120";
String  str2="12.4";
String  str3="168.00";

int num = Integer.parseInt(str1);
System.out.println(num);

float val=Float.parseFloat(str2);
System.out.println(val);

double dig=Double.parseDouble(str3);
System.out.println(dig);

}
}