import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		String str;
		String s;
		String t;
		
		while(true) {
			str = br.readLine();
			if(str == null)
				break;
			
			st = new StringTokenizer(str);
			s = st.nextToken();
			t = st.nextToken();
			boolean flag = false;
			
			int idx = 0;
			for(int i=0; i<s.length(); i++) {

				for(int j=idx; j<t.length(); j++) {
					idx++;
					if(s.charAt(i) == t.charAt(j)) {
						flag = true;
						break;
					}else {
						flag = false;
					}
				}
			}
			
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}
		
		br.close();
	}

}
