// public class SortColors {
//     public static void main(String args[])
//     {
//         int arr[]={2,0,1,2,1};
//         int i=0;
//         int j=arr.length-1;
//         int k=arr.length-1;
//         while(i<j)
//         {
//             System.out.println(arr[i]);
//             while(i<j && arr[i]==0)
//             {
//                 i++;
//                 System.out.println("loop in i "+i);
//             }
//             while(i<j && arr[j]==1 && arr[j]==2);
//             {
//                 j--;
//                 System.out.println("loop in j "+j);
//             }
//             while(arr[k]==2)
//             {
//                 k--;
//                 System.out.println("loop in k "+k);
//             }
//             if(arr[i]==1)
//             {
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
                
//             }
//             else if(arr[i]==2)
//             {
//                 int temp=arr[i];
//                 arr[i]=arr[k];
//                 arr[k]=temp;
                
//             }


//         }

//         for(int num : arr)
//         {
//             System.out.println(num);
//         }
//     }
// }

public class SortColors {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high]
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
