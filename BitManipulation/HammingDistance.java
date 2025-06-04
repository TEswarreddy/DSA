package BitManipulation;

public class HammingDistance {
    public static void main(String[] args)
    {
        int x=1;
        int y=4;
        int hammingDistance=0;
        int xor=x^y;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(xor));
        while(xor!=0)
        {
            if((xor & 1)==1)
            {
                hammingDistance++;
                
            }
            xor >>=1;
            //System.out.println(Integer.toBinaryString(xor));
        }
        System.out.println(hammingDistance);

        // optimization
        System.out.println(Integer.bitCount(x^y));

        // both have same time and space complexity is O(1)
    }
}
