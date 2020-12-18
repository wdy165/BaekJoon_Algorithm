package Main;
import java.util.Scanner;

class Queue{
	private int[] queue;
	private int frontIndex = 0;
	private int backIndex = -1;
	
	Queue(){}
	Queue(int N){
		queue = new int[N];
	}
	public void push(int X) {
		queue[++backIndex] = X;
	}
	public int pop() {
		if(empty() == 1) {
			return -1;
		}else {
			return queue[frontIndex++];
		}
	}
	public int size() {
		return backIndex - frontIndex + 1;
	}
	public int empty() {
		if(size() == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	public int front() {
		if(empty() == 1) {
			return -1;
		}else {
			return queue[frontIndex];
		}
	}
	public int back() {
		if(empty() == 1) {
			return -1;
		}else {
			return queue[backIndex];
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Queue queue = new Queue(N);
		StringBuilder sb = new StringBuilder();
		
		if(N >= 1 && N <= 10000) {
			for(int i = 0; i < N; i++) {
				String cmd = scan.next();
				switch(cmd) {
				case "push":
					int X = scan.nextInt();
					queue.push(X);
					break;
				case "pop":
					sb.append(queue.pop());
					sb.append("\n");
					break;
				case "size":
					sb.append(queue.size());
					sb.append("\n");
					break;
				case "empty":
					sb.append(queue.empty());
					sb.append("\n");
					break;
				case "front":
					sb.append(queue.front());
					sb.append("\n");
					break;
				case "back":
					sb.append(queue.back());
					sb.append("\n");
					break;
				}
			}
		}
		System.out.println(sb.toString());
	}			
}
