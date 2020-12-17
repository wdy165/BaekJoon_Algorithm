package Main;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		if(N >= 1 && N <= 10000) {
			for(int i = 0; i < N; i++) {
				String cmd = scan.next();
				switch(cmd) {
					case "push":
						int X = scan.nextInt();
						queue.add(X);
						break;
					case "pop":
						if(queue.isEmpty()) {
							sb.append(-1 + "\n");
						}else {
							sb.append(queue.pop() + "\n");
						}
						break;
					case "size":
						sb.append(queue.size() + "\n");
						break;
					case "empty":
						if(queue.isEmpty()) {
							sb.append(1 + "\n");
						}else {
							sb.append(0 + "\n");
						}
						break;
					case "front":
						if(queue.isEmpty()) {
							sb.append(-1 + "\n");
						}else {
							sb.append(queue.peekFirst() + "\n");
						}
						break;
					case "back":
						if(queue.isEmpty()) {
							sb.append(-1 + "\n");
						}else {
							sb.append(queue.peekLast() + "\n");
						}
						break;
				}
			}
			System.out.println(sb.toString());
		}
	}
}