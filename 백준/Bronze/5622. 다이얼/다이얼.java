import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		int second = 0;
		
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)=='A' || st.charAt(i)=='B' || st.charAt(i)=='C') {
				second += 3;
			} else if (st.charAt(i)=='D' || st.charAt(i)=='E' || st.charAt(i)=='F'){
				second += 4;
			}else if (st.charAt(i)=='G' || st.charAt(i)=='H' || st.charAt(i)=='I'){
				second += 5;
			}else if (st.charAt(i)=='J' || st.charAt(i)=='K' || st.charAt(i)=='L'){
				second += 6;
			}else if (st.charAt(i)=='M' || st.charAt(i)=='N' || st.charAt(i)=='O'){
				second += 7;
			}else if (st.charAt(i)=='P' || st.charAt(i)=='Q' || st.charAt(i)=='R'|| st.charAt(i)=='S'){
				second += 8;
			}else if (st.charAt(i)=='T' || st.charAt(i)=='U' || st.charAt(i)=='V'){
				second += 9;
			}else if (st.charAt(i)=='W' || st.charAt(i)=='X' || st.charAt(i)=='Y'|| st.charAt(i)=='Z'){
				second += 10;
			}
		}
		
		System.out.println(second);
		sc.close();
	}

}
