import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cost = sc.nextInt();
		int num = sc.nextInt();
		int num2 = 0;
		int temp = 0;
		int[] ob = new int[num*2];
		
		for(int i=0; i<num*2; i++) {
			ob[i] = sc.nextInt();
		}
		
		for(int i =0; i<ob.length-1; i=i+2) {
			temp = ob[i]*ob[i+1];
			num2 = num2+temp;
		}
		
		if(num2==cost) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
