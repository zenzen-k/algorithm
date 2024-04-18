import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		
		
		if(t1==60 && t2==60 && t3==60) {
			System.out.println("Equilateral");
		}else if(t1+t2+t3 == 180) {
			if(t1!=t2 && t1!=t3 && t2!=t3)
				System.out.println("Scalene");
			else
				System.out.println("Isosceles");
		}else {
			System.out.println("Error");
		}
		
		
	}
}
