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
		StringBuilder sb = new StringBuilder();
		
		if(N >= 1 && N <= 1000) {
			for(int i = 1; i <= N; i++) {
				q.offer(i);
			}
		}
		
		while(!q.isEmpty()) {
			sb.append(q.poll()).append(" ");
			if(q.isEmpty()) {
				break;
			}
			q.offer(q.poll());
		}
		System.out.println(sb.toString());
	}
}