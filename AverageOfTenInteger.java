package Question_Practice;
//Take 10 integers from keyboard using loop and print their average value on the screen.
import java.util.Scanner;
public class AverageOfTenInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integer: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int num4=scanner.nextInt();
        int num5=scanner.nextInt();
        int num6=scanner.nextInt();
        int num7=scanner.nextInt();
        int num8=scanner.nextInt();
        int num9=scanner.nextInt();
        int num10=scanner.nextInt();

        float Totalnum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;

        float avg = Totalnum/10;
        System.out.println(avg);

    }
}
