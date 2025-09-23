package Arrays;

import java.util.ArrayList;

public class AlternatePositiveNegative {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<>();
        
        al.add(9);
        al.add(4);
        al.add(-2);
        al.add(-1);
        al.add(5);
        al.add(0);
        al.add(-5);
        al.add(-3);
        al.add(2);
        int[] pos=new int[al.size()];
        int[] neg=new int[al.size()];
        int i=0,j=0;
        for(int num: al){
            if(num>=0){
                pos[i]=num;
                i++;
            }else{
               neg[j]=num;
               j++;
            }
        }
        al.clear();
        
        int p=0,q=0;
        while(p<i && q<j){
            al.add(pos[p++]);
            al.add(neg[q++]);

        }

        while(p<i){
            al.add(pos[p++]);
           
        }
        while(q<j){
            al.add(neg[q++]);
            
        }
        System.out.println(al);
        
    }
}
