import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = new String[20];
		double scoresum = 0;
		double totalsum = 0;
		String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
		double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		
		for(int i=0; i<20; i++) {
			str[i] = br.readLine();
			
			StringTokenizer st = new StringTokenizer(str[i], " "); // 띄워쓰기 기준으로 토큰나눔
			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			
			for(int j=0; j<gradeList.length; j++) {
				if(grade.equals(gradeList[j]) && !grade.equals("P")) {
					totalsum += score * gradeScore[j];
					scoresum += score;
				}
			}
		}
		System.out.printf("%.6f", totalsum/scoresum);
		
	}
}
