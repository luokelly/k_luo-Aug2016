
public class Calculate {
	public static int square(int number){
		return(number*number);
	}
	
	public static int cube(int number){
		return(number*number*number);
	}
	
	public static double average(double num, double secNum){
		return(num + secNum / 2);
	}
	
	public static double average(double num, double secNum, double thirdNum){
		return(num + secNum + thirdNum / 3);
	}
	
	public static double toDegrees(double num){
		return(num * (180/3.14159));
	}
	
	public static double toRadians(double num){
		return(num * (3.14159/180));
	}
	
	public static double discriminant(double a, double b, double c){
		return(b * b - (4 * a * c));
	}
	
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){

		int numeratorOfAnswer = wholeNum * denominator + numerator;
		return(numeratorOfAnswer + "/" + denominator);
	}
	
	public static String foil(int a, int b, int c, int d, String x){
		int firstFoil = a * c;
		int secFoil = (a * d) + (b * c); 
		int thirdFoil = (b * d);
		return(firstFoil + x + " ^2 " + secFoil + x + thirdFoil);
	}
	
	public static boolean isDivisibleBy(int num, int secNum){
		if(num % secNum == 0){
			return(true);
		}else{
			return(false);
		}
	}
	
	public static double absValue(double num){
		if()
	}
	
	public static int max(int num, int secNum){
		if(num > secNum){
			return(num);
		}else{
			return(secNum);
		}
	}
	
	public static int
}