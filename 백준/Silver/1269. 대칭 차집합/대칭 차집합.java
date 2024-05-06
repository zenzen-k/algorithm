import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int acount = Integer.parseInt(st.nextToken());
		int bcount = Integer.parseInt(st.nextToken());
		int count = 0;
		
		HashSet<String> a = new HashSet<>();
		HashSet<String> b = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<acount; i++) {
			a.add(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<bcount; i++) {
			b.add(st.nextToken());
		}
		
		for(String num : a) {
			if(!b.contains(num))
				count++;
		}
		
		for(String num : b) {
			if(!a.contains(num))
				count++;
		}
		
		System.out.println(count);
		
	}
}

