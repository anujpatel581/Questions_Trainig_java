/*Enter limit =5
 * output= 0 1  1  2  3
 */

package Questions_Trainig_java;
import java.util.Scanner;

public class FibbonaciLimit5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter limit");
        int limit = scanner.nextInt();
        int n1=0, n2=1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=2; i<limit; i++){

            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
    
}
