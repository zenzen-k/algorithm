import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		int max = 0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max < arr[i])
				max = arr[i];
		}
		
		String str = "plus";
		String result = "YES";
		for(int i=0; i<n-1; i++) {
			if(arr[i] == max)
				str = "minus";
			
			if(str.equals("plus")) {
				if(arr[i] >= arr[i+1]) {
					result = "NO";
					break;
				}
			}else {
				if(arr[i] <= arr[i+1]) {
					result = "NO";
					break;
				}
			}
		}
		
		System.out.println(result);
		
		br.close();
	}

}
