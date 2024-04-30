import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> name1 = new HashSet<>();
		ArrayList<String> result = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			name1.add(br.readLine());
		}
		
		for(int i=0; i<m; i++) {
			String name2 = br.readLine();
			if(name1.contains(name2)) {
				result.add(name2);
			}
		}
		
		Collections.sort(result);
		
		bw.append(result.size() + "\n");
		for(String str : result) {
			bw.append(str + "\n");
		}
		
		bw.flush();
	}
	
	
	
}

