import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 대출 요청 수
		int[] arr = new int[31]; 
		
		int max = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=a; j<b; j++) {
				arr[j] ++;
				if(max < arr[j])
					max = arr[j];
			}
		}
		
		int k = Integer.parseInt(br.readLine()); // 책의 수
		
		System.out.println(max<=k?1:0);
		br.close();
	}

}
