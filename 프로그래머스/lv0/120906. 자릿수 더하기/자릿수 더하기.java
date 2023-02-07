class Solution {
    public int solution(int n) {
        int a = 0;
		for(int i=0; i<Integer.toString(n).length(); i++) {
			a += Integer.toString(n).charAt(i)-48;
		}
        return a;
    }
}