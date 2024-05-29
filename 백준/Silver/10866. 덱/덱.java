import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();

			switch(str) {
			case "push_front" : 
				deq.addFirst(Integer.parseInt(st.nextToken()));
				break;

			case "push_back" : 
				deq.addLast(Integer.parseInt(st.nextToken()));
				break;

			case "pop_front" : 
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.pollFirst() + "\n");
				}
				break;

			case "pop_back" : 
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.pollLast() + "\n");
				}
				break;

			case "size" : 
				sb.append(deq.size() + "\n");
				break;

			case "empty" : 
				if(deq.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;

			case "front" : 
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.peekFirst() + "\n");
				}
				break;

			case "back" : 
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.peekLast() + "\n");
				}
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}

