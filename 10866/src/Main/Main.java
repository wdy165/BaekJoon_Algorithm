package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> de = new ArrayDeque<Integer>();
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		
		if(N >= 1 && N <= 10000) {
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				switch(st.nextToken()) {
				case "push_front":
					de.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					de.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					if(de.size() == 0) {
						System.out.println(-1);
						break;
					}else {
						System.out.println(de.pollFirst());
						break;
					}
				case "pop_back":
					if(de.size() == 0) {
						System.out.println(-1);
						break;
					}else {
						System.out.println(de.pollLast());
						break;
					}
				case "size":
					System.out.println(de.size());
					break;
				case "empty":
					if(de.isEmpty()) {
						System.out.println(1);
						break;
					}else {
						System.out.println(0);
						break;
					}
				case "front":
					if(de.size() == 0) {
						System.out.println(-1);
						break;
					}else {
						System.out.println(de.peekFirst());
						break;
					}
				case "back":
					if(de.size() == 0) {
						System.out.println(-1);
						break;
					}else {
						System.out.println(de.peekLast());
						break;
					}
				}
			}
		}
	}
}