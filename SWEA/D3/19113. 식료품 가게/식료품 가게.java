import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int c=1; c<=tc; c++) {
			
			int n = Integer.parseInt(br.readLine());
			long price[] = new long[n*2];
			long result[] = new long[n];
			boolean[] used = new boolean[n*2];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<n*2; i++) {
				price[i] = Integer.parseInt(st.nextToken());
			}
			
			int m = n-1;
			for(int i=(n*2)-1; i>=0; i--) {
				if(price[i]%4 == 0 && !used[i]) {
					used[i] = true;
					
					for(int j=0; j<n*2; j++) {
						if(!used[j] && (int)(price[i]*0.75) == price[j]) {
							used[j] = true;
							result[m] = price[j];
							m --;
							break;
						}
					}
					
				}
			}
			
			System.out.print("#" + c);
			for(long i : result) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
		
		
	} // end main()

}