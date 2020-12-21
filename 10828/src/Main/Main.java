package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		StringTokenizer s = null;
		
		if(N >= 1 && N <= 10000) {
			for(int i = 0; i < N; i++) {
				s = new StringTokenizer(br.readLine(), " ");
				switch(s.nextToken()) {
				case "push":
						st.push(Integer.parseInt(s.nextToken()));
						break;
				case "pop":
					if(st.isEmpty()) {
						System.out.println(-1);
						break;
					}else {
						System.out.println(st.pop());
						break;
					}
				case "size":
					System.out.println(st.size());
					break;
				case "empty":
					if(st.isEmpty()) {
						System.out.println(1);
						break;
					}else {
						System.out.println(0);
						break;
					}
				case "top":
					if(st.isEmpty()) {
						System.out.println(-1);
					}else {
						System.out.println(st.peek());
					}
				}
			}
		}
	}
}