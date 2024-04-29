import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> pocketdex1 = new HashMap<>();
		HashMap<Integer, String> pocketdex2 = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			String p = br.readLine();
			pocketdex1.put(p, i);
			pocketdex2.put(i, p);
		}
		
		for(int i=0; i<m; i++) {
			String pocketmon = br.readLine();
			if(isNumberic(pocketmon)) {
				System.out.println(pocketdex2.get(Integer.parseInt(pocketmon)));
			}else {
				System.out.println(pocketdex1.get(pocketmon));
			}
		}
	}
	
	public static boolean isNumberic(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
	}
}