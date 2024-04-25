import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int ori[] = new int[n];
		int sor[] = new int[n];
		HashMap<Integer, Integer> rank = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			ori[i] = sor[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sor);
		
		int r = 0;
		for(int i=0; i<n; i++) {
			if(!rank.containsKey(sor[i])) {
				rank.put(sor[i], r);
				r++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int k : ori) { // value 불러오기
			sb.append(rank.get(k)).append(" ");
		}
		System.out.println(sb);
		
	}
}
