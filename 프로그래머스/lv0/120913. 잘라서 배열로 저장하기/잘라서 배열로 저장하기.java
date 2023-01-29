class Solution {
    public String[] solution(String my_str, int n) {
        int num = (int) Math.ceil((double) my_str.length() / n);
			
		String[] answer = new String[num];

		int num2 = 0;
		
		for(int i=0; i<my_str.length(); i+=n) {
			if(i+n > my_str.length()) {
				answer[num2] = my_str.substring(i);
				break;
			}
			answer[num2] = my_str.substring(i,i+n);
			num2 ++;
		}
        return answer;
    }
}