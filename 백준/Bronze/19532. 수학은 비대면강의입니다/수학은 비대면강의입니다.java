import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		System.out.print((c*e - f*b) / (a*e - b*d) + " "); // x
		System.out.print((c*d - a*f) / (b*d - a*e)); // y
		
		/*
		ax + by = c
		dx + ey = f
		
		adx + bdy = cd
		adx + aey = af
		
		(adx + bdy) - (adx + aey) = cd - af 
		(bdy - aey) = (cd - af)
		(bd - ae) y = (cd - af)
		y = (cd - af) / (bd - ae)
		
		
		aex + bey = ce
		bdx + bey = fb
		(aex + bey) - (bdx + bey) = ce - fb
		x = (ce-fb) / (ae - bd) 
		
		*/
		
	}
}
