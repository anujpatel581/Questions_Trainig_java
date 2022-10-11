/*
 *enter limit = 61
 output = 
 1
 2
 3
 4
 pass
 6
 7........14 .pass. 16......49.pass pass pass pass........60 
 * 
 */

package Questions_Trainig_java;
import java.util.Scanner;
public class found5ByPass{
    public static void main(String[] args){
        boolean IFfoundFive=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur limit: ");
        int limit = sc.nextInt();

        int mod, temp;
        for(int i=0; i<limit; i++){
            temp=i;
            while(temp>0){
                mod=temp%10;
                if(mod==5)
                {
                    IFfoundFive=true;
                    break;
                }
                temp=temp/10;



            }
            if(IFfoundFive=true){
                System.out.println( "pass");
            }
            else{
                System.out.println(i);
            }
            IFfoundFive=false;
            
        }

    }

}
