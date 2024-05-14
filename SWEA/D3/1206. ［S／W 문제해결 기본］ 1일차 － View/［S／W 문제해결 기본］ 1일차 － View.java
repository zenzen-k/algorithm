import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.FileInputStream;

class Solution
{
    static int n;
	static int height[];
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1; i<=10; i++) {
			n = Integer.parseInt(br.readLine());
			height = new int[n];
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j =0; j<n; j++) {
				height[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=2; j<n-2; j++) {
				int max = Math.max(height[j - 1], Math.max(height[j - 2], Math.max(height[j + 1], height[j + 2])));
				
				if(height[j] > max) {
					count += height[j] - max;
				}
			}
			
			System.out.println("#" + i + " " + count);
			
		}
		
	}
}