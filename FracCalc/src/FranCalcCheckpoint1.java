/*Kelly Luo APCS2 11/7/16
 * This code will prompt the user for 
 */
import java.util.*;

public class FranCalcCheckpoint1 {

    
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
        System.out.println("Enter two fractions with a ");
        String answer = console.nextLine();
        String a = produceAnswer(answer);
        System.out.println(a);
    }

    public static String produceAnswer(String answer) {
        String fraction[] = answer.split(" ");
        return fraction[2];
    }
}