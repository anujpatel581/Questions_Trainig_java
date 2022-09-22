package Questions_Trainig;

import java.util.Scanner;

public class SmallestOddDigit {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to smallest odd digits: ");
        int n = sc.nextInt();

        int s=n%10;
        while(n>0){

            int mod = n%10;

            if(n%2!=0){
                if(s>mod){
                    s=mod;
                }
            }

            n=n/10;
        }
        System.out.println(s);
    }
    
}
