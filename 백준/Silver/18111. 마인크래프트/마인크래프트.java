import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 세로
		int m = Integer.parseInt(st.nextToken()); // 가로
		int b = Integer.parseInt(st.nextToken()); // 인벤 블록 수
		
		int arr[][] = new int[n][m];
		int max = 0;
		int min = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > max) {
					max = arr[i][j];
				}else if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		
		
		int time = 999999999; // 걸리는 시간
		int high = 0;
		for(int k=min; k<=max; k++) {
			
			int timeCnt = 0;
			int block = b;
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					
					if(k < arr[i][j]) {
						timeCnt += ( (arr[i][j] - k) *2);
						block += (arr[i][j] - k );
					}else {
						timeCnt += k - arr[i][j];
						block -= k - arr[i][j] ;
					}
					
				}
				
			}
			if(block < 0)
				break;
			
			if(time >= timeCnt) {
				time = timeCnt;
				high = k;
			}
			
		}
		
		System.out.println(time + " " + high);
		
		br.close();
	}

}
