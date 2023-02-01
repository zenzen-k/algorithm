import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean [] arr = new boolean[31];
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<28; i++) {
			int n = sc.nextInt();
			arr[n] = true;
		}
		for(int i=1;i<arr.length;i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
