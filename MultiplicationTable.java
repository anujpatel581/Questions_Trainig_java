package Question_Practice;

//Print multiplication table of 24, 50 and 29 using loop.

public class MultiplicationTable {
    public static void main(String[] args){
        int num =24;
        int num2 =50;
        int num3 =29;
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d\n", num, i, num*i).println();
          
        }
          for(int i=1; i<=10; i++){
            System.out.printf("\n%d * %d = %d", num2, i, num2*i).println();
          
        }
          for(int i=1; i<=10; i++){
            System.out.printf("\n%d * %d = %d", num3, i, num3*i).println();
          
        }
    }
    
}
