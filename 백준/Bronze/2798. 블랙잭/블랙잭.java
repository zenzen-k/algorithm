import java.util.Scanner;

public class Main {
	public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int temp = 0;
		
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					sum = arr[i]+arr[j]+arr[k];
					if(sum <= m && temp < sum)
						temp = sum;
				}
			}
		}
		System.out.println(temp);
		
		sc.close();
		
	}
}

