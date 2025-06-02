public class PrimeCounts {
    public static int sieveAlgorithm(int n)
    {
        if (n <= 2) return 0;
        boolean prime[] =new boolean[n];
        for(int i=0;i<n;i++)
        {
            prime[i]=true;
        }
        prime[0]=false; // 0 is not a prime number
        prime[1]=false; // 1 is not a prime number
        for(int p=2;p*p<=n;p++)
        {
            if(prime[p]==true)
            {
                for(int i= p*p;i<=n;i=i+p)
                {
                    prime[i]=false;
                }
            }
        }
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(prime[j]==true)
            {
                count++;
                //System.out.println(j);
            }
        }
        return count;

    }
    public static void main(String[] args)
    {
        int n=3;
        int result=sieveAlgorithm(n);
        System.out.println("Number of prime numbers less than or equal to " + n + " is: " + result);
    }
}
