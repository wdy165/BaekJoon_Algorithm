package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		Queue<Integer> q = new LinkedList<Integer>();
		
		if(N >= 1 && N <= 500000) {
			for(int i = 1; i <= N; i++) {
				q.offer(i);
			}
		}
		
		int num = 0;
		while(!q.isEmpty()) {
			num = q.peek();
			q.poll();
			if(!q.isEmpty()) {
				q.offer(q.peek());
				q.poll();
			}
		}
		System.out.println(num);
	}
}