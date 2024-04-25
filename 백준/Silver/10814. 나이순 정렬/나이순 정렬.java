import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Person per[] = new Person[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			per[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.sort(per, (p1,p2)->{
			return p1.age - p2.age;
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(per[i].age + " " + per[i].name);
		}
		
	}
	
	public static class Person {
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
}
