package Arrays;
// Maximum product of a triplet (subsequence of size 3) in array
public class ThreeGreatCandidates {
    public static void main(String args[]){
        int arr[]={1, -4, 3, -6, 7, 0};
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int num:arr){
            if(num>fmax){
                tmax=smax;
                smax=fmax;
                fmax=num;
            }else if(num>smax){
                tmax=smax;
                smax=num;
            }else if(num>tmax){
                tmax=num;
            }
            if (num < fmin) {
                smin = fmin;
                fmin = num;
            } else if (num < smin) {
                smin = num;
            }
        }
        int sol1=fmax*smax*tmax;
        int sol2=fmax*fmin*smin;
        int sol=Math.max(sol1,sol2);
        System.out.println(sol);
    }
}
