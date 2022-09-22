package Questions_Trainig;
import java.util.Scanner;

//Find the sum of digit until last digit without without using mod, div, loop, or any conditional statement
public class SumOfUnitUntilLastSingleDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter ur num to get sum until last digit ");
        int n = sc.nextInt();

        int res = n%9;
        System.out.println(res);  // example = 564 = 15 , 15=6 ans
    }
    
}
