import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken()); // 잡초크기
		int n = Integer.parseInt(st.nextToken());
		int count = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			int s = 0;

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);

				if (ch == ' ')
					s++;
				else if (ch >= 'A' && ch <= 'Z')
					s += 4;
				else
					s += 2;
			}

			if (s <= size)
				count++;
		}

		System.out.println(count);
		br.close();
	}

}
