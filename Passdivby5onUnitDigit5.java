/*Enter limit =16 
 * 1.2.3.4 pass.6.7.8.9.10.11.12.13.14.pass.16
*/



package Questions_Trainig_java;
import java.util.Scanner;
public class Passdivby5onUnitDigit5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit");
        int limit = sc.nextInt();

        for(int i = 1; i<=limit; i++){
            int mod=i%10;
            if(mod==5){
                System.out.println("PASS");
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
