import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stackInt = new Stack<>();
		
		int k = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				stackInt.pop();
			}else {
				stackInt.push(n);
			}
		}
		
		int size = stackInt.size();
		
		for(int i=0; i<size; i++) {
			sum += stackInt.pop();
		}
		System.out.println(sum);
		
		br.close();
	}

}
