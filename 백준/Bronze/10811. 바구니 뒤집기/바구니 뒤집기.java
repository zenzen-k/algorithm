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
			
			basket = reverseArr(basket, z, k);
		}
		
		String arrToString = Arrays.toString(basket);
        String rep = arrToString.replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","");
        System.out.println(rep);
	}
	
	static int[] reverseArr(int[] arr, int z, int k) {
		int[] re = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			re[i] = arr[i];
		}
		
		for(int i=z-1, j=k-1; i<k; i++, j--) {
			re[i] = arr[j];
		}
		
		return re;
	}
}