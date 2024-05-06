import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		ArrayList<Ball> ballList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Ball b = new Ball(i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			ballList.add(b);
		}

		Collections.sort(ballList, (o1, o2) -> o1.size - o2.size);

		int[] result = new int[count];
		int[] colors = new int[count + 1]; // 색상별 사이즈 합
		int ball_idx = 0;
		int sumSize = 0;
		for (int i = 0; i < count; i++) {
			Ball current = ballList.get(i); // 현재 공
			
			while (ballList.get(ball_idx).size < current.size) {
				sumSize += ballList.get(ball_idx).size;
				colors[ballList.get(ball_idx).color] += ballList.get(ball_idx).size;
				ball_idx ++;
			}
			result[current.index] = sumSize - colors[current.color];
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(result[i] + "\n");
		}
		
		System.out.print(sb.toString());

	}

	public static class Ball {
		int index;
		int color;
		int size;

		public Ball(int index, int color, int size) {
			this.index = index;
			this.color = color;
			this.size = size;
		}

	}

}
