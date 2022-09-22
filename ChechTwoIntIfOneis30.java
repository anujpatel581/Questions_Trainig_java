package Questions_Trainig;
import java.util.Scanner;
//check two given integers, written true if one of them is 30 or if there sum is 30(using operators)
public class ChechTwoIntIfOneis30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first num: ");
        int a = scanner.nextInt();
        System.out.println("enter second num: ");
        int b = scanner.nextInt();
        
        boolean res;
        res=(a==30 || b==30|| a+b==30)?true:false;
        System.out.println(res);
    }
    
}
