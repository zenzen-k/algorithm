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
		
		int n = Integer.parseInt(br.readLine());

		Deque<int[]> deq = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) {
			deq.add(new int[] {i, Integer.parseInt(st.nextToken())});
		}
		
		while(deq.size() > 1) {
			int[] k = deq.peekFirst();
			sb.append(k[0] + " ");
			deq.poll();
			
			if( k[1] > 0) {
				for(int i=1; i<k[1]; i++) {
					deq.add(deq.poll());
				}
			}else {
				for(int i=k[1]; i<-1; i++) {
					deq.addFirst(deq.pollLast());
				}
				deq.addFirst(deq.pollLast());
			}
		}
		sb.append(deq.peekFirst()[0]);
		
		System.out.println(sb);
		br.close();
	}

}
