import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str[] = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}

		Arrays.sort(str, (s1, s2) -> {
			// compare 메소드는 리턴타입이 int형임. 양의정수 0 음의정수. -> 양수일경우 위치를 바꿈
			if (s1.length() == s2.length())
				return s1.compareTo(s2); // 사전순, Comparator 내부에 있는 compareTo 메서드 
			else
				return s1.length() - s2.length();
		});

		System.out.println(str[0]);
		for (int i = 1; i < n; i++) {
			if (!str[i].equals(str[i - 1]))
				System.out.println(str[i]);
		}

	}
}
