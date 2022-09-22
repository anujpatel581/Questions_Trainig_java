package Questions_Trainig;
import java.util.Scanner;

//get absolute difference between n and 51 if(n>51) written triple the absolute difference (using operators)
public class DiffNand51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int result;
        result =(n>51)?(n-51)*3:(n-51);
        System.out.println(result);
    }
    
}
