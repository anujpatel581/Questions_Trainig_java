package Questions_Trainig;
import java.util.Scanner;
//check a given integer and written true if the value is within 10, 100 or 200;(using operators)

public class CheckIntWithin10_100_200 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num to check: ");
        int n = sc.nextInt();
        boolean res;
        res=(n<10 || n<100 || n<200)?true:false;

        System.out.println(res);
    }    
    
}
