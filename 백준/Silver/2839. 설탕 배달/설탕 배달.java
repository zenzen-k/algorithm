import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		if(n == 4 || n == 7)
			count = -1;
		else if(n%5 == 0)
			count = n/5;
		else if(n%5 == 1 || n%5 == 3) // 1이나 3인경우 -> 6, 11, 13.. -> 6/5 +1 3,3   11/5+1 5,3,3 n/5에서 하나씩증가함
			count = n/5 + 1;
		else // 나머지 2, 4
			count = n/5 + 2;
		
		System.out.println(count);
	}
}
