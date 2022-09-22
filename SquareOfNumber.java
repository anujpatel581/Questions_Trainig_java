package Questions_Trainig;
import java.util.Scanner;
public class SquareOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num to know square : ");
        int n = sc.nextInt();

        n=n*n;
        System.out.println("Square of number : "+n);
    }
    
}
