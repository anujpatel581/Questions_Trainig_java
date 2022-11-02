
/*
number = 12;
sum = 2;

number = 456;
sum =3;

*/







import java.util.Scanner;

public class Count_Digit_of_GivenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int sum=0;

        while(num>0){
            num /= 10;
            ++sum;
        }
        System.out.println("sum of digit: "+sum);
    }
}
