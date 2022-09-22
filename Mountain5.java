package Questions_Trainig;
/*
 * ip=4
 * op=
 * 1
 * 23
 * 456
 * 78910
 */

public class Mountain5 {
     public static void main(String[] args){
        int n=4;
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k);
                k++;

            }
            System.out.println();
        }
    }
    
}
