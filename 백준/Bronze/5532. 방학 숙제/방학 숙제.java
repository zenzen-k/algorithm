import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double c = Double.parseDouble(br.readLine());
		double d = Double.parseDouble(br.readLine());
		
		int result = l - (int)Math.ceil(Math.max(a/c , b/d));
		System.out.println(result);
		
		br.close();
	}
}