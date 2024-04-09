import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니수량
		int m = sc.nextInt(); // 반복횟수
		
		int basket[] = new int[n];
		for(int i=0; i<n; i++) {
			basket[i] = i+1;
		}
		int temp = 0;
		for(int i=0; i<m; i++) {
			int z = sc.nextInt();
			int k = sc.nextInt();
			
			temp = basket[z-1];
			basket[z-1] = basket[k-1];
			basket[k-1] = temp;
		}
		
		String arrToString = Arrays.toString(basket);
        String rep = arrToString.replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","");
        System.out.println(rep);
	}
}