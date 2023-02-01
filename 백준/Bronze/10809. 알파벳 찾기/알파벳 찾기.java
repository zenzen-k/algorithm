import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String alp = sc.next();
		int[] num = new int[26];
		
		for(int i=0; i<num.length; i++) {
			num[i] = -1;
		}

		
		for(int i=0; i<26; i++) {
			for(int j=alp.length()-1; j>=0; j--) {
				if((i+97)==alp.charAt(j)) {
					num[i] = j;
				}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		sc.close();
	}
}
