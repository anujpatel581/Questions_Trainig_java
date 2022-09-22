package Questions_Trainig;
import java.util.Scanner;

public class LargestOddDigit {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to know largest odd digit: ");
        int n = sc.nextInt();

        int l=n%10;
        while(n>0){

            int mod = n%10;

            if(n%2!=0){
                if(l<mod){
                    l=mod;
                }
            }

            n=n/10;
        }
        System.out.println(l);
    }
    
}
