import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] sub = new int[n];
		double[] sub2 = new double[n];
		int max = sub[0];
		
		for(int i=0; i<n; i++) {
			sub[i] = sc.nextInt();
			
			if(sub[i]>max) {
				max = sub[i];
			}
		}
		
		double sum=0;
		for(int i=0; i<n; i++) {
			sub2[i] = sub[i]/(double)max*100;
			sum += sub2[i];
		}
		System.out.println(sum/n);
	}

}
