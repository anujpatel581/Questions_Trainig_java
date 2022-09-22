package Questions_Trainig;
import java.util.Scanner;
public class SumOfOddDigit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to sum of odd digits:");
        int n =sc.nextInt();

        int sum = 0;

        while(n>0){
            int mod = n % 10;
            if(n%2!=0){
                sum = sum+mod;
            }

            n=n/10;
        }
        System.out.println(sum);
    }
    
}
