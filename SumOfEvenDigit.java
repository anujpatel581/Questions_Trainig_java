package Questions_Trainig;
import java.util.Scanner;
public class SumOfEvenDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to sum of even digits");
        int n=sc.nextInt();

        int sum=0;

        while(n>10){

            int mod = n%10;
            if(n%2==0){
               sum = sum+mod;
            }
            
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
