/*Enter Base value = 3;
 * Enter power value = 3;
 * result = 3*3*3 = 27;
 */
package Questions_Trainig_java;
import java.util.Scanner;
public class BasevalueAndPowervalue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter th base value: ");
        int base = sc.nextInt();
        System.out.println("enter the power value: ");
        int power = sc.nextInt();

        int res = 1;
        for(int i=1; i<=power; i++){
            res= res * base;
        }
        System.out.println("Result value:"+res);

    }
}

/*Enter Base value = 3;
 * Enter power value = 3;
 * result = 3*3*3 = 27;
 */
