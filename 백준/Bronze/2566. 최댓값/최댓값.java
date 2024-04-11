import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int row=0, col=0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int n = sc.nextInt();
				if(max < n) {
					max = n;
					row = i;
					col = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((row+1) + " " + (col+1));
	}
}