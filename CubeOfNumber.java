package Questions_Trainig;
import java.util.Scanner;
/*find the cube of given number enter by the user */
public class CubeOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to know cube of number");
        int n = sc.nextInt();

        n=n*n*n;
        System.out.println("cube of ur num is :"+n);
    }
    
}
