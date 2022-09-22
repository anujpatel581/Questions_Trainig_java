package Questions_Trainig;
import java.util.Scanner;

public class DiffBetweenFirstAndLastDigitofAnynum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter num to know diff between first and last digits");
        int n = scanner.nextInt();

        int d1=n%10;
        while(n>10){
            n=n/10;
        }
        System.out.println(n-d1);

    }
    
}
