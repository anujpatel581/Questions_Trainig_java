import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
       int res = 0;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      while(n>0){
        int mod=n%10;
        n = n/10;
        res = res+mod;
      }
      System.out.println("Alice must go in path-"+res);
	}
}
