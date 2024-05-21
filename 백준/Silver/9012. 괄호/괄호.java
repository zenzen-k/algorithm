import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i=0; i<k; i++) {
			Stack<Integer> stackStr = new Stack<>();
			String str = br.readLine();
			
			boolean flag = true;
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == ('(')) {
					stackStr.push(1);
				}else {
					try {
						stackStr.pop();
					} catch (EmptyStackException e) {
						flag = false;
						break;
					}
				}
			}
			
			sb.append((stackStr.isEmpty()&&flag ? "YES" : "NO")+ "\n");
		}
		
		System.out.println(sb);
		br.close();
	}

}
