import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		// 5배수마다 0이 하나씩 더 증가됨
		while(num >= 5) {
			cnt += num / 5;
			num /= 5; 
		}
		
		System.out.println(cnt);
		br.close();
	}

}
