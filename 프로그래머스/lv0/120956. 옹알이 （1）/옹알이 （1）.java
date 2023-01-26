class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
       
        String[] result = {"aya", "ye", "woo", "ma"}; 
		int num = 0;
		
		
		for(String x : babbling) {
			for(String y : result) {
				x = x.replace(y, "1");
			}
			x = x.replaceAll("1","");
			if(x.equals(""))
				answer ++;
		}
        
        return answer;
    }
}