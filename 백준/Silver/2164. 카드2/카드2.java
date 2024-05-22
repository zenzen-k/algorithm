import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i=1; i<=n; i++) {
			deq.offer(i);
		}
		
		while(deq.size() != 1) {
			deq.poll();
			deq.offer(deq.poll());
		}
		
		System.out.println(deq.peek());
		br.close();
	}

}