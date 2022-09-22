package Questions_Trainig;
/*
 * ip=4,
 * op=
 * ****
 *  ***
 *   **
 *    *
 */

public class Mountain6 {
    public static void main(String[] args){
        int n=4;
         for(int i=n; i>0; i--){

            for (int j=n; j>i; j--)
            {
                System.out.print(" ");
            }   
            for(int k=1; k<=i; k++){
                System.out.print("*");
              
            
                

            }
            System.out.println();
        }
    }
    
}
