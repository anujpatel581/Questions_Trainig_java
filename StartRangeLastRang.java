/*Enter range =20;
 * Enter last range =30;
 *  result = odd = 21, 23, 25.....29
 *           even = 22, 24,26,.....30
 *           no of odd no = 5;
 *           no of even no =5;
 */
package Questions_Trainig_java;
import java.util.Scanner;
public class StartRangeLastRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting range: ");
        int st = sc.nextInt();

        System.out.println("Enter End Range: ");
        int end = sc.nextInt();

        int oddcount=0; 
        int evencout=0;

        //for even
        System.out.println("even number: ");

        for(int i=st; i<=end; i++){
            if(i%2==0){
                System.out.println(i);
                evencout++;
            }
        }
        //for odd
        System.out.println("odd number: ");
        for(int i=st; i<=end; i++){
            if(i%2!=0){
                System.out.println(i);
                oddcount++;
            }
        }
        System.out.println(evencout);
        System.out.println(oddcount);
    }
    
}
