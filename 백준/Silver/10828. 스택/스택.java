import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch (st.nextToken()) {
			case "push": 
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" : 
				if(stack.isEmpty())
					sb.append(-1 + "\n");
				else{
					sb.append(stack.pop() + "\n");
				}
				break;
			case "size" :
				sb.append(stack.size() + "\n");
				break;
			case "empty" :
				sb.append(stack.isEmpty() ? 1 : 0);
				sb.append("\n");
				break;
			case "top" :
				if(stack.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(stack.peek() + "\n");
				break;
			}
			
		}
		
		System.out.println(sb);
		br.close();
	}

}
