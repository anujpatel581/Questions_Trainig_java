package Questions_Trainig;
import java.util.Scanner;

/*four digit integer given as input we find and
 print absolute difference between first and last digits */

public class FourDigitDiffeBetweenfirstAndLastDigit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to know difference between the first and last digit: ");

        int n = sc.nextInt();

        int d1 = n%10;
        n = n/1000;
        int d2 = n%10;
        System.out.println(d2-d1);

    }
    
}
