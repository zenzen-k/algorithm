import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int len = str.length();
		String result = "not cute";
		
		if(len >= 5) {
			for(int i=len-5; i<len; i++) {
				sb.append(str.charAt(i));
			}
		}
		if(sb.toString().equals("driip"))
			result = "cute";
		
		System.out.println(result);
		
		br.close();
	}

}
