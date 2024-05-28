import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cut = (int) Math.round(n * 0.15);

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		int size =  n - (cut * 2);
		
		int sum = 0;
		for (int i = cut; i < size + cut; i++) {
			sum += list.get(i);
		}

		System.out.println((int) Math.round((double)sum / size));

		br.close();
	}

}
