import java.util.ArrayList;
import java.util.List;
public class GenerateParenthesis {

    public static List<String> backtrack(List<String> result,String current,int open,int close,int max){
        if(current.length() ==max *2){
            result.add(current);
            return result;
        }
        if(open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if(close<open){
            backtrack(result,current+")",open,close+1,max);
        }
        return result;
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        return backtrack(result,"",0, 0,n);
    }
    public static void main(String[] args){
        int n=3;
        List<String> combinations=generateParenthesis(n);
        for(String combination: combinations){
            System.out.println(combination);
        }
        System.out.println("Total combinations: " + combinations.size());
    }
}
