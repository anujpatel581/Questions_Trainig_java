package Questions_Trainig;
import java.util.Scanner;

public class FindLargestDigit {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to find largest digit in num: ");
        int n = sc.nextInt();

        int l=n%10;
        while(n>0){

            int mod = n%10;

            if(l<mod){
                l=mod;
            }
            n=n/10;

        }
        System.out.println(l);
    }
    
}
