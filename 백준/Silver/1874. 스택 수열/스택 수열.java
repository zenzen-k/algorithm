import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		int s = 1;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(s <= num) {
				for(int j=s; j<=num; j++) {
					stack.push(j);
					s = num + 1;
					sb.append("+\n");
				}
			}
			if(stack.peek() == num) {
				stack.pop();
				sb.append("-\n");
			}else {
				sb.setLength(0); // 초기화. 시간소모가 가장 적음
				sb.append("NO");
				break;
			}
		}
		System.out.println(sb);
		
		br.close();
	}

}
