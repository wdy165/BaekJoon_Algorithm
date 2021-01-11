package Main;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String person = st.nextToken();
			String inout = st.nextToken();
			if(inout.equals("enter")) {
				list.add(person);
			}else {
				list.remove(person);
			}
		}
		Collections.sort(list);
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
}
