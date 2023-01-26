class Solution {
    public int[] solution(int num, int total) {
        
        
        int sum = 0;
		
		int[] answer = new int[num];
		
		for(int i=0; i<num; i++) {
			sum += i;
		}
		
		int a = (total - sum)/num;
		
		for(int i=0; i<num; i++) {
			answer[i] = a++; 
		}
		
        
        
        return answer;
    }
}