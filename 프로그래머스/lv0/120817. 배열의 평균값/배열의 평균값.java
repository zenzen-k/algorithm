class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
		double sum = 0;
        for(int x : numbers){
            sum += x;
        }
        return sum/numbers.length;
    }
}