package Question_Practice;
import java.util.Scanner;
/*Write a program to enter the values of two variables 'a' and 'b' from keyboard
and then check if both the conditions 'a< 50' and 'a < b' are true. */

public class IfBothTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Value: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Value: ");
        int b = sc.nextInt();
        if(a<50 && a<b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }



    }
    
}
