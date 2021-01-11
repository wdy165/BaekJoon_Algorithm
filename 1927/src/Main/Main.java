package Main;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws NumberFormatException, IOException {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] x = new int[N];
		
		for(int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(br.readLine());
			if(x[i] == 0) {
				if(queue.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(queue.poll());
				}
			}else {
				queue.add(x[i]);
			}
		}
	}
}