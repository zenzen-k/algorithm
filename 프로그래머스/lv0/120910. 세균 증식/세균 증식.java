class Solution {
    public int solution(int n, int t) {
        int answer = 1;
        for(int i=0; i<t; i++) {
        	answer = n*2;
        	n = answer;
        }
        return answer;
    }
}