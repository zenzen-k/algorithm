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
		
		int n = Integer.parseInt(br.readLine()); // 큐스택 구성하는 자료구조 개수
		int arr[] = new int[n]; // 큐인지(0), 스택인지(1) 저장
		Deque<Integer> deq = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(arr[i] == 0) {
				deq.offerLast(num); // 맨뒤로ㄱㄱ
			}
		}
		
		int pushNum = Integer.parseInt(br.readLine()); // 삽입할 원소 갯수
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<pushNum; i++) {
			deq.offerFirst(Integer.parseInt(st.nextToken()));
			sb.append(deq.pollLast() + " ");
		}
		
		System.out.println(sb);
		br.close();
	}

}

/*
0 1 1 0 -> 0: 큐 1: 스택,
1 2 3 4
2넣으면


큐) 1자리에 2를 넣고 1이 pop됨 (pop이 1) : x1 = 1
-> 2 2 3 4

스택) 2자리에 아까 pop된 1을 넣음. 스택은 넣고 pop 해도 그대로 ㅇㅇ
-> 2 2 3 4 : x2 = 1

스택) 3자리에 1을 넣고 pop
-> 2 2 3 4 : x3 = 1

큐) 4자리에 1을 넣고 pop(4가 pop됨)
-> 2 2 3 1 : x4 = 4

2 넣었을때의 xn = 4다.


: 스택은 그대로니까 큐만 넣었을때, 마지막 숫자가 출력 ㅇㅇ
2 : 2 -> 1 4 -> 4
4 : 4 -> 2 1 -> 1
7 : 7 -> 4 2 -> 2
 */