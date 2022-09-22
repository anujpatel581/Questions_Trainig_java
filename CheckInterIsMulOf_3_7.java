package Questions_Trainig;
import java.util.Scanner;
//check whether a given positive number is multiple of 3 or  7(using operator)
public class CheckInterIsMulOf_3_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num to check whether it is: ");
        int n= sc.nextInt();
        boolean res ;
        res=(n%3==0 || n%7==0)?true:false;
        System.out.println(res);
    }
    
}
