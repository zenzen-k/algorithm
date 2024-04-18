import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			if(str.equals("0 0 0")) break;
			
			int arr[] = {Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken())};
			
			Arrays.sort(arr);
			
			if(arr[0] + arr[1] <= arr[2]) {
				System.out.println("Invalid");
			}else {
				if(arr[0] == arr[1] && arr[1] == arr[2]) {
					System.out.println("Equilateral");
				}else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
					System.out.println("Isosceles");
				}else {
					System.out.println("Scalene");
				}
			}
		}
		
	}
}
