import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			String str[] = br.readLine().split(" ");
			arr[i][1] = Integer.parseInt(str[0]);
			arr[i][0] = Integer.parseInt(str[1]);
		}
		
		Arrays.sort(arr, (a1, a2)->{ // a1, a2 -> arr[x], a1[y], a2[y] -> y값
			if(a1[0] == a2[0]) // x값 비교
				return a1[1] - a2[1]; // Comparator 비교방식. 음수면 위치안바꿈, 양수면 위치바꿈
			else
				return a1[0] - a2[0];
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
	}
}