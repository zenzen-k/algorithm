import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stackInt = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int stackNum = Integer.parseInt(st.nextToken());

			switch (stackNum) {
			case 1: 
				stackInt.push(Integer.parseInt(st.nextToken()));
				break;
			
			case 2: 
				sb.append((stackInt.empty() ? -1 : stackInt.pop()) + "\n");
				break;
			
			case 3: 
				sb.append(stackInt.size() + "\n");
				break;
			
			case 4: 
				sb.append((stackInt.empty() ? 1 : 0) + "\n");
				break;
			
			case 5: 
				sb.append((stackInt.empty() ? -1 : stackInt.peek()) + "\n");
				break;
			}
			
		}
		System.out.println(sb.toString());
		br.close();
	}

}
