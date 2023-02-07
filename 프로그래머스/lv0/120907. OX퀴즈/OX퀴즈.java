class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] sp = {};
        
        
        for(int i=0; i<quiz.length; i++) {
        	sp = quiz[i].split(" ");
        	int a = 0;
        	if(sp[1].equals("-"))
        		a = Integer.parseInt(sp[0]) - Integer.parseInt(sp[2]);
        	else if(sp[1].equals("+"))
        		a = Integer.parseInt(sp[0]) + Integer.parseInt(sp[2]);
        	
        	answer[i] = (Integer.parseInt(sp[4]) == a) ? "O" : "X";
        }

        return answer;
    }
}