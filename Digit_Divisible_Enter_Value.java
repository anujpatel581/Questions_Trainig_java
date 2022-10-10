/*Enter digit =5;
 * output = 5,10,13,20............100;
 */


package Questions_Trainig_java;
import java.util.Scanner;
public class DigitDivisibleEnterValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Digit: ");
        int digit = sc.nextInt();
        int st = 10;
        int end = 10*10;

        for(int i=st; i<=end; i++) {
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
    
}


// output = 5,10,13,20............100;
