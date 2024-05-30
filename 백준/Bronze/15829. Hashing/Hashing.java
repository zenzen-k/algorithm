import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		
		String str = br.readLine();
		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			sum +=  ((int)ch - 96) * Math.pow(31, i);
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
