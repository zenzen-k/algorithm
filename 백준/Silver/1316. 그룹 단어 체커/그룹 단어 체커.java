import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = n;
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			String ts = "";
			
			for(int j=0; j<str.length(); j++) {
				StringBuffer sb = new StringBuffer();
				if(j==0) {
					ts += str.charAt(j);
				}
				else if(str.charAt(j)!= str.charAt(j-1)) {
					if(ts.indexOf(str.charAt(j)) != -1) {
						count --;
						break;
					}else {
						ts += str.charAt(j);
					}
				}
			}
			
		}
		
		System.out.println(count);
	}
}