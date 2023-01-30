class Solution {
	public int solution(int[] array) {
		int answer = 0;
		for(int i=0; i<array.length; i++){
			String num = Integer.toString(array[i]);
			//한칸씩 배열에 저장함
			String[] arr = num.split(""); 
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("7"))
					answer++;
			}
		}
		return answer;
	}
}