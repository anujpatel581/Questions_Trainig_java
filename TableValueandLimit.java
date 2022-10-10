/*Enter Table value = 4;
 * Enter Table value =3;
 * result value = 4*1=4
 *                4*2=8
 *                4*3=12
 */               
package Questions_Trainig_java;
import java.util.Scanner;
public class TableValueandLimit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table value: ");
        int num = sc.nextInt();
        System.out.println("enter limit value: ");
        int limit = sc.nextInt();
        for(int i = 0; i < limit; i++){
            System.out.printf("%d * % = %d",num,i,num*i).println();

        }
    }

    
}


 /* result value = 4*1=4
 *                4*2=8
 *                4*3=12
 */
