import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			String str = br.readLine();
			
			// 종료조건
			if(str.equals("."))
				break;
			
			sb.append(solve(str) + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	
	public static String solve(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			// 소괄호 짝맞추기
			else if(c == ')') {
				if(stack.empty() || stack.peek() != '(') { // empty조건을 뒤로보내면 EmptyStackException. 조건을 앞에 먼저 작성할 것
					return "no";
				}else {
					stack.pop();
				}
			}
			// 대괄호 짝맞추기
			else if(c == ']') {
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}else {
					stack.pop();
				}
			}
			
		}
		
		// 여는괄호가 없는데 닫는괄호있을 때 no 로 리턴값됨.
		// 여는괄호가 남았으면 no 리턴해야함
		return stack.empty() ? "yes" : "no";
	}
}