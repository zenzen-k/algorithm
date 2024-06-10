import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String letters = br.readLine();
		StringTokenizer st = new StringTokenizer(letters, " |.|!|?|,");
		String str = "A";
		int n = 0;

		// CHIPMUNKS
		while (st.hasMoreTokens()) {
			String an = "";
			str = st.nextToken();

			if (str.length() == 9) {
				n = str.charAt(0) - 67;

				for (int i = 0; i < 9; i++) {

					if ((str.charAt(i) - n) > 'Z') {
						an += (char)(65 + ((str.charAt(i) - n) - 90) - 1);

					} else if ((str.charAt(i) - n) < 'A') {
						an += (char)(90 - (65 - (str.charAt(i) - n)) + 1);

					} else {
						an += (char) (str.charAt(i) - n);
					}

				} // for

				if (an.equals("CHIPMUNKS"))
					break;

			} // if
		} // while
		
		
		String result = "";
		for(int i=0; i<letters.length(); i++) {
			
			if(letters.charAt(i) >= 'A' && letters.charAt(i) <= 'Z') {
				
				if((letters.charAt(i) - n) < 'A') {
					result += (char)(90 - (65 - (letters.charAt(i) - n)) + 1);
				}else if((letters.charAt(i) - n) > 'Z') {
					result += (char)(65 + ((letters.charAt(i) - n) - 90) - 1);
				}else {
					result += (char)(letters.charAt(i) - n);
				}
				
			}
			else {
				result += letters.charAt(i);
			}
			
		}
		System.out.println(result);

		br.close();
	}

}
