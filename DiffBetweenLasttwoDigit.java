package Questions_Trainig;
import java.util.Scanner;

/* an integer given as input and we need to
find and print difference between last two digit*/

 public class DiffBetweenLasttwoDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the num to know diff between last two digits");
        int n= scanner.nextInt();

        int d1 = n%10;
        n=n/10;
        int d2 =n%10;

        System.out.println(d2-d1);
    }
}