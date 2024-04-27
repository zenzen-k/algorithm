import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<String, String> person = new HashMap<>();
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			
			if(state.equals("enter"))
				person.put(name, state);
			else if(state.equals("leave"))
				person.remove(name);
		}
		
		ArrayList<String> persons = new ArrayList<>(person.keySet());
		Collections.sort(persons, Collections.reverseOrder());
		
		for(String name : persons)
			System.out.println(name);
	}
}

