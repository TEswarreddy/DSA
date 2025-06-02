public class FactorialTrailingZeroes {
    public static void main(String[] args){
        int n=5;
        int count=0;
        while(n>=5)
        {
            count += n/5;
            n=n/5;

        }
        System.out.println(count);
    }
}
