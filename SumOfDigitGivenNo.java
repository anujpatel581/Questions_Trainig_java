package Questions_Trainig;
import java.util.Scanner;
public class SumOfDigitGivenNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to sum of digits: ");
        int n = sc.nextInt();

        int sum = 0;

        while(n>0){

            int mod = n%10;

            n=n/10;

            sum = sum + mod;

        }
        System.out.println(sum);
    }
}