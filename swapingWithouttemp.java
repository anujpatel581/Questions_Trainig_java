public class swapingWithouttemp {
    public static void main(String[] args){
        int first = 5;
        int second = 6;

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println(first);
        System.out.println(second);
        
    }
    
}
