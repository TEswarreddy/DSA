package Arrays;
public class MedianOfTwoSortedArrays {
    public static double firstApproch(int nums1[],int[] nums2)
    {
        int m=nums1.length;
        int n=nums2.length;

        int nums3[] =new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                nums3[k]=nums2[j];
                j++;
                k++;
            }
            
        }
        while (i < m) {
            nums3[k++] = nums1[i++];
        }

        while (j < n) {
            nums3[k++] = nums2[j++];  
        }
        for(int r=0;r<m+n;r++)
        {
            System.out.println(nums3[r]);
        }
        double median=0.0;
        int total=m+n;
        if((m+n)%2==0)
        {
            int m1=nums3[total/2];
            System.out.println("m1: " + m1);
            int m2=nums3[total/2 - 1];
            System.out.println("m2: " + m2);
            median=(double)(m1+m2)/2;
        }
        else
        {
            median=nums3[(m+n)/2];
            
        }
        return median;

    }
    public static double secondApproch(int[] num1,int[] num2)
    {
        
        int m=num1.length;
        int n=num2.length;
        if(m>n)
        {
            return secondApproch(num2, num1); // Ensure num1 is the smaller array
        }
        int start=0;
        int end=m;
        double median=0.0;
        while(start<=end)
        {
            int partitionx= (start + end) / 2;
            int partitiony=(m+n+1)/2-partitionx;
           

            //left side
            int maxLeftx=0;
            if(partitionx==0)
            {
                maxLeftx=Integer.MIN_VALUE;
            }
            else
            {
                maxLeftx=num1[partitionx-1];
            }
            int minRightx=0;
            if(partitionx==m)
            {
                minRightx=Integer.MAX_VALUE;
            }
            else
            {
                minRightx=num1[partitionx];
            }

            //right side
            int maxLefty=0;
            if(partitiony==0)
            {
                maxLefty=Integer.MIN_VALUE;
            }
            else
            {
                maxLefty=num2[partitiony-1];
            }
            int minRighty=0;
            if(partitiony==n)
            {
                minRighty=Integer.MAX_VALUE;
            }
            else
            {
                minRighty=num2[partitiony];
            }
            if(maxLeftx<=minRighty && maxLefty<=minRightx)
            {
                //we have found the correct partition
                if((m+n)%2==0)
                {
                    median=(double) (Math.max(maxLeftx, maxLefty) + Math.min(minRightx, minRighty)) / 2.0;
                    break;
                }
                else
                {
                    median=(double) Math.max(maxLeftx, maxLefty);
                    break;
                }
            }
            else if(maxLeftx>minRighty)
            {
                end=partitionx-1;
            }
            else
            {
                start=partitionx+1;
            }
        }
        return median;
        
    }
    public static void main(String[] args)
    {
        int[] nums1 = {1, 3};
        int[] nums2 = {6,7};
        double median = firstApproch(nums1, nums2);
        double median2 = secondApproch(nums1, nums2);
        System.out.println("The median is: " + median);
        System.out.println("The median is: " + median2);
    }
}
