import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		double arr[] = new double[t];
		
		for(int i=0; i<t; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i=0; i<7; i++) {
			sb.append(String.format("%.3f\n", arr[i]));
		}
		
		System.out.println(sb);
		br.close();
	}

}
