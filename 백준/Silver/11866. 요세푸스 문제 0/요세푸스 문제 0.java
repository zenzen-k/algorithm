import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i=1; i<=n; i++) {
			deq.offer(i);
		}
		
		sb.append("<");
		while(deq.size() > 1) {
			
			for(int i = 0; i < k - 1; i++) { // k=3 이면 1,2는 맨뒤로 보내고 3만 poll
				int val = deq.poll();
				deq.offer(val);
			}
			sb.append(deq.poll()+", ");
		}
		sb.append(deq.poll()+">");
		
		System.out.println(sb);
		br.close();
	}

}
