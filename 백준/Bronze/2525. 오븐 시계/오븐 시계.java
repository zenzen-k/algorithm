import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//입력 시
		int b = sc.nextInt();	//입력 분
		int time = sc.nextInt();
		
		int minute = a * 60 + b;
		minute += time;
		
		int hour = minute / 60;

		minute = minute % 60;
		
		if(hour>=24) {
			hour = hour%24;
		}
		
		System.out.println(hour + " " + minute);
	}

}