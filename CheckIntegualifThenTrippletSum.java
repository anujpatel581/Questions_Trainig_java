package Questions_Trainig;
import java.util.Scanner;
//check whether given two integer are equal if yes then written triple the sum or Written the sum
public class CheckIntegualifThenTrippletSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num: ");
        int a = sc.nextInt();
        System.out.println("enter second num: ");
        int b = sc.nextInt();
        int res;
        res=(a==b)?(a+b)*3:(a+b);
        System.out.println(res);
    }
    
}
