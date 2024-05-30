import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 개수
		int n = Integer.parseInt(st.nextToken()); // 필요한 개수
		
		int[] arr = new int[k];
		long max = 0;
		long mid = 0;
		long min = 0;
		
		for(int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		max++;
		while(min < max) {
			
			mid = (max + min) / 2;
			
			long cnt = 0;
			
			// mid 길이로 만들었을때 랜선 개수
			for(int i=0; i<arr.length; i++) {
				cnt += (arr[i] / mid);
			}
			
			// 만들어진 개수가 필요한 개수보다 작으면 길이를 줄이고, 크면 최소 길이를 늘려줌
			if(cnt < n) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
			
		}
		
		System.out.println(min - 1);
		br.close();
	}

}
