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
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str) {
			case "1" : 
				deq.offerFirst(Integer.parseInt(st.nextToken()));
				break;
				
			case "2" : 
				deq.offerLast(Integer.parseInt(st.nextToken()));
				break;
				
			case "3" : 
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.pollFirst() + "\n");
				}
				break;
				
			case "4" : 
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.pollLast() + "\n");
				}
				break;
				
			case "5" : 
				sb.append(deq.size() + "\n");
				break;
				
			case "6" : 
				if(deq.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
				
			case "7" : 
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.peekFirst() + "\n");
				}
				break;
				
			case "8" : 
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
