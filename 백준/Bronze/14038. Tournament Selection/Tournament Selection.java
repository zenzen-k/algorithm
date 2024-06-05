import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0; 
		for(int i=0; i<6; i++) {
			String str = br.readLine();
			
			if(str.equals("W"))
				count ++;
		}
		
		if(count == 0)
			System.out.println(-1);
		else if(count < 3)
			System.out.println(3);
		else if(count < 5)
			System.out.println(2);
		else
			System.out.println(1);
		
		
		br.close();
	}

}
