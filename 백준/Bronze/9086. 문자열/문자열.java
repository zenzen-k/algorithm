import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] str = new String[t];
		
		for(int i=0; i<t; i++) {
			String tc = sc.next();
			str[i] = tc.charAt(0) + "" + tc.charAt(tc.length()-1);
		}
		
		
		System.out.println(Arrays.toString(str).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", ""));
	}
}
