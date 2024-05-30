import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		BigInteger sum = new BigInteger("0");
		
		for(int i=0; i<n; i++) {
			sum = sum.add(BigInteger.valueOf(str.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
		}
		
		System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
		br.close();
	}

}
