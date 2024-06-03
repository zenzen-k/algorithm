import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double n = Double.parseDouble(br.readLine());
		
		double result = 0;
		for(int i=1; i<=n; i++) {
			result += n/i;
		}
		System.out.println(result);
		br.close();
	}

	
}
