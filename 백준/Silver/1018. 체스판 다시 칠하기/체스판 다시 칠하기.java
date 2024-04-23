import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static String[] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num, " ");
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());

		arr = new String[row];
		for (int i = 0; i < row; i++) {
			arr[i] = br.readLine();
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= row - 8; i++) {
			for (int j = 0; j <= col - 8; j++) { // 시작번호
				int result = chess(i, j);

				if (min > result)
					min = result;
			}
		}

		System.out.println(min);

	}

	public static int chess(int start_row, int start_col) {
		String[] b = { "WBWBWBWB", "BWBWBWBW" };
		int count = 0;

		for (int i = start_row; i < start_row + 8; i++) {
			for (int j = 0; j < 8; j++) {
				int col = start_col + j;
				if (arr[i].charAt(col) != b[i % 2].charAt(j)) {
					count++;
				}
			}
		}

		return Math.min(count, 64 - count);
	}
}
