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

// 배열 정렬 함수 이용한 방법은 아래
// 이제는 이렇게 다양한 함수이용법도 알아두자!
import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] ch = my_string.toLowerCase().toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
