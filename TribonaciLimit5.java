/*Enter limit tribonaci = 5
 * output= 0  1  1  2  4;
 */
package Questions_Trainig_java;
import java.util.Scanner;

public class TribonaciLimit5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter limit");
        int limit = scanner.nextInt();
        int n1=0, n2=1,n3=1;
        int n4;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        for (int i=3; i<limit; i++){

            n4=n1+n2+n3;
            System.out.println(n4);
            n1=n2;
            n2=n3;
            n3=n4;
        }
    }
    
}
