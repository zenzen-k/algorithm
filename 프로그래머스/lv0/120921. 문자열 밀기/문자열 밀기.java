class Solution {
    public int solution(String A, String B) {
        int answer = 0;
		
		StringBuffer sb = new StringBuffer(A);
		
		while(answer < sb.length()) {
			char ch = sb.charAt(sb.length()-1);
			if(B.equals(sb.toString())) {
				break;
			}
			
			sb.delete(sb.length()-1, sb.length());
			sb = sb.insert(0, ch);
			answer ++;
		}
		
		if(answer == A.length()) {
			answer = -1;
		}
		
        return answer;
    }
}