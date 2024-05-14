import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1; i<=10; i++) {
			int n = Integer.parseInt(br.readLine());
			int count[] = new int[100];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<count.length; j++) {
				count[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0; j<n; j++) {
				Arrays.sort(count);
				count[0]++;
				count[99]--;
			}
			
			Arrays.sort(count);
			System.out.println("#" + i + " " + (count[99]-count[0]));
		}
	}
}