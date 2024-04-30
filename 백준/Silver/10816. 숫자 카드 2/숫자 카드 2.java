import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int card[] = new int[n];
		
		for(int i=0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<m; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			bw.write(findEndIndex(card, value) - findStartIndex(card, value) + " ");
		}
		
		bw.flush();
	}
	
	
	// 이진탐색 
	public static int findStartIndex(int[] arr, int val) {
		int left = 0;
		int right = arr.length;
		
		while(left < right) {
			int mid = (left + right)/2;
			
			if(val <= arr[mid]) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		return left;
	}
	
	// <
	public static int findEndIndex(int[] arr, int val) {
		int left = 0;
		int right = arr.length;
		
		while(left < right) {
			int mid = (left + right)/2;
			
			if(val < arr[mid]) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		return left;
	}
}

