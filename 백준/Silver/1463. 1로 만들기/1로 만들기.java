import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static Integer[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		arr = new Integer[num + 1];
		arr[0] = arr[1] = 0;
		
		System.out.println(dp(num));
		br.close();
	}
	
	
	static int dp(int num) {
		
		if(arr[num] == null) {
			
			if(num % 6 == 0) {
				arr[num] = Math.min(dp(num/3), Math.min(dp(num/2), dp(num-1))) + 1;
			}else if(num%3 == 0) {
				arr[num] = Math.min(dp(num/3), dp(num-1)) + 1;
			}else if(num%2 == 0) {
				arr[num] = Math.min(dp(num/2), dp(num-1)) + 1;
			}else
				arr[num] = dp(num - 1) + 1;
		}
		
		return arr[num];
	}
	
	// 다른 방법
//	static int dp(int num, int count) {
//		if(num < 2) {
//			return count;
//		}
//		return Math.min(dp(num / 2, count + 1 + (num % 2)), dp(num / 3, count + 1 + (num % 3)));
//	}

}
