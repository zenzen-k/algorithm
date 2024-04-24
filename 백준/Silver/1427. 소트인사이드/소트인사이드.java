import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String t = br.readLine();
		Integer arr[] = new Integer[t.length()];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)t.charAt(i) - 48;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i:arr) {
			System.out.print(i);
		}
		
	}
}
