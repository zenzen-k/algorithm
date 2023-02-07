import java.util.ArrayList;
import java.util.List;

class Solution {
    public Integer[] solution(int n, int[] numlist) {
        List<Integer> arrlist = new ArrayList<Integer>();
        
        for(int num : numlist) {
        	if(num%n==0)
        		arrlist.add(num);
        }
        
        return arrlist.toArray(new Integer[0]);
    }
}