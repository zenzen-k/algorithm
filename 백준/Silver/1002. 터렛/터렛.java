import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			System.out.println(pointNum(x1, y1, r1, x2, y2, r2));
		}

		br.close();
	}

	static int pointNum(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		} else if (distance > Math.pow(r1 + r2, 2) || distance < Math.pow(r2 - r1, 2)) { // 두점사이거리가 반지름보다 클때, 원안에 원
			return 0;
		} else if (distance == Math.pow(r1 + r2, 2) || distance == Math.pow(r2 - r1, 2)) { /// 외접할때, 내접할때
			return 1;
		}
		return 2;
	}

}
