import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int h, m = 0;
		
		if( y>=45) {
			m = y-45;
		}else if(y<=45){
			m = y+15;
		}
		
		if((y-45)<0) {
			if(x == 0) {
				h = 23;
			}else
				h = x-1;
		}
		else {
			h = x;
		}
		
		System.out.println(h + " " + m);
		sc.close();
	}

}