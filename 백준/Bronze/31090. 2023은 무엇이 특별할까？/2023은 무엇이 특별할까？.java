import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String str = br.readLine();
			int year = Integer.parseInt(str) + 1;
			int num = Integer.parseInt(str.substring(2, 4));
			
			if(year % num == 0)
				sb.append("Good\n");
			else
				sb.append("Bye\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
