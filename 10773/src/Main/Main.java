package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.valueOf(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		
		if(K >= 1 && K <= 100000) {
			for(int i = 1; i <= K; i++) {
				int n = Integer.valueOf(br.readLine());
				if(n == 0) {
					if(!stack.isEmpty()) {
					int a = stack.pop();
					sum -= a;
					}else {
						break;
					}
				}else {
					stack.push(n);
					sum += n;
				}
			}
		}
		System.out.println(sum);
	}
}
