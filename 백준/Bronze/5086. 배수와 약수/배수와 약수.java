import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(2 != 0) {
			String sb = br.readLine();
			StringTokenizer st = new StringTokenizer(sb, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a ==0 && b==0)
				break;
			if(b%a == 0) {
				System.out.println("factor");
			}else if(a%b == 0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
		}
		
	}
}