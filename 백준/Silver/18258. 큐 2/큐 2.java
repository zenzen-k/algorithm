import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new ArrayDeque<>();
		// 자바에서 queue는 맨 뒤의 요소를 반환하는 메서드가 없어서 deque 사용
		// deque : offer() push, poll() remove, 
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str){
			case "push": 
				deq.offer(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.poll() + "\n");
				}
				break;
				
			case "size":
				sb.append(deq.size() + "\n");
				break;
				
			case "empty":
				if(deq.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
				
			case "front":
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deq.peekFirst() + "\n");
				}
				break;
				
			case "back":
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