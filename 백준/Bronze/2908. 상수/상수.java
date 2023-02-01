import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = num1;
		
		for(int i=10; i<=1000; i *= 10) {
			if(num1%i/(i/10) == num2%i/(i/10)) {
				continue;
			} 
			else if (num1%i/(i/10) < num2%i/(i/10)) {
				max = num2;
				break;
			}
			else {
				max = num1;
				break;
			}
		}
		
		String st = String.valueOf(max);
		char[] ch = new char[3];
		for(int i =2; i>=0; i--) {
			ch[i] = st.charAt(i);
			System.out.print(ch[i]);
		}
	}
}
