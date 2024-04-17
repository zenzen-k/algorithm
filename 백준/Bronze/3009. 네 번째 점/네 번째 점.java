import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int f1 = sc.nextInt();
		int f2 = sc.nextInt();
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		
		int c1, c2;
		if(f1 == s1) c1 = t1;
		else if(s1 == t1) c1 = f1;
		else c1 = s1;
		
		if(f2 == s2) c2 = t2;
		else if(s2 == t2) c2 = f2;
		else c2 = s2;
		
		System.out.println(c1 + " " + c2);
		
	}
}