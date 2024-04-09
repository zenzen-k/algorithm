import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while ((str=br.readLine()) != null) {
			bw.write(str + "\n");
			bw.flush();
		}
		
		br.close();
		bw.close();
	}
}