/*Kelly Luo APCS2 11/7/16
 * This code will prompt the user for 
 */
import java.util.*;

public class FranCalcCheckpoint1 {

    
    public static void main(String[] args) {
    	
    	Scanner console = new Scanner(System.in);
        System.out.println("Enter two fractions with a ");
        String answer = console.nextLine();
        while(answer != "quit"){
        	
        	String a = produceAnswer(answer);
        	System.out.println(a);
        }
    }

    public static String produceAnswer(String answer) {
        String fraction[] = answer.split(" ");
        return fraction[2];
    }
    
    	public static int[] componentsOfOperand(String Operand){
            int[] parts = new int[3];
            parts[2] = 1;
            if(Operand.contains("")){
                    String[] components = Operand.split("");
                    int wholeNumber = Integer.parseInt(components[0]);            //turns whole number from string to int
                    parts[0] = wholeNumber;
                    String fraction = components[1];
                    String[] fractionComponents = fraction.split("/");
                    int numerator = Integer.parseInt(fractionComponents[0]);            //turns numerator and denominator from string to int
                    int denominator = Integer.parseInt(fractionComponents[1]);
                    parts[1] = numerator;
                    parts[2] = denominator;
            }else if(!Operand.contains("_") && Operand.contains("/")) {
                    String[] splitFrac = Operand.split("/");
                    int numerator = Integer.parseInt(splitFrac[0]);
                    int denominator = Integer.parseInt(splitFrac[1]);
                    parts[1] = numerator;
                    parts[2] = denominator;
            } else{
                 String[] blank = Operand.split(" ");
                 int number = Integer.parseInt(blank[0]);
                 parts[0] = number;
            }
            return parts;
            }
    }
}