import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// Arrays.sort(arr);
		for (int i = 0; i < t - 1; i++) {
			for (int j = i + 1; j < t; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}
}
