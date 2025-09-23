package Arrays;
class SecondLargestElement{
    public static void main(String[] args){
        int arr[]={12, 35, 1, 10, 34, 1};
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstmax){
                secondmax=firstmax;
                firstmax=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=firstmax){
                secondmax=arr[i];
            }
        }
        if(secondmax!=Integer.MIN_VALUE){
            System.out.println(secondmax);
        }else{
            System.out.println("-1");
        }
    }
}