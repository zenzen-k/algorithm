import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 수열크기
		int k = Integer.parseInt(st.nextToken()); // 반복횟수
		
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), ",");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<k; i++) {
			sequence();
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
			if(i != n - 1)
				System.out.print(",");
		}
		
		br.close();
	}
	
	static void sequence() {
		--n;
		for(int i=0; i<n; i++) {
			arr[i] = arr[i+1] - arr[i];
		}
	}
			
}