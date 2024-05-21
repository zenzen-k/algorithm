import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int order = 1;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == order) {
				order ++;
			}else {
				stack.push(num);
			}
			
			while(true) {
				if(!stack.empty() && stack.peek() == order){
					stack.pop();
					order ++;
				}else {
					break;
				}
			}
			
		}
		
		System.out.println(stack.empty() ? "Nice" : "Sad");
		br.close();
	}

}