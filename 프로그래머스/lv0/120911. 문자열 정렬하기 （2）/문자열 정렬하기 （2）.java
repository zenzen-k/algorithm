class Solution {
    public String solution(String my_string) {
       String answer = "";
        
        my_string = my_string.toLowerCase();

       	int[] arr = new int[my_string.length()];
        int temp;
       	
        for(int i=0; i<my_string.length(); i++) {
        	arr[i] = my_string.charAt(i);
        }
        
        for(int i=0; i<arr.length-1; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i]>arr[j]) {
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }

        for(int x : arr) {
        	answer += (char)x;
        }
        
        return answer;
    }
}