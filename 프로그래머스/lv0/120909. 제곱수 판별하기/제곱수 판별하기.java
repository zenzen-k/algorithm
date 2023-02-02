class Solution {
    public int solution(int n) {
        int answer = 0;

        double d = Math.sqrt(n);
        int i = (int)Math.sqrt(n);
        
        if(d==i)
        	answer = 1;
        else
        	answer = 2;

        return answer;
    }
}