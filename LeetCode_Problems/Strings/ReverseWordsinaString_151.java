package Strings;

public class ReverseWordsinaString_151 {

    public  static String reverseWords(String s) {
        //navie approch

        // String arr[]=s.trim().split("\\s+"); 
        // int n=arr.length;
        // int l=0,r=n-1;
        // while(l<r){
        //     String temp=arr[l];
        //     arr[l]=arr[r];
        //     arr[r]=temp;
        //     l++;r--;
        // }
        // String s1="";
        // for(int i=0;i<n;i++){
        //     s1 +=arr[i].trim();
        //     if(i!=n-1){
        //         s1+=" ";
        //     }

            
        // }
        // return s1.trim();

        //optimal approach

        StringBuilder result=new StringBuilder();
        int n=s.length();
        int i=n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(result.length()>0) result.append(" ");
            result.append(s.substring(i+1, j+1));
        }
        return result.toString().trim();
        
    }
    public static void main(String[] args) {
        String s="a good   example";
        String sol=reverseWords(s);
        System.out.println(sol);
    }
}