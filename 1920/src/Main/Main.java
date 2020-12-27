package Main;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static int [] A;
	
	public static int find(int start, int end, int check) {
		
		int mid = (start + end) / 2;
		
		if(mid >= end) return 0;
		
		if(A[mid] == check) {
			return 1;
		}else if(A[mid] < check) {
			return find(mid+1, end, check);
		}else {
			return find(start, mid, check);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		int M = scan.nextInt();
		int check;
		Arrays.sort(A);
		
		for(int i = 0; i < M; i++) {
			check = scan.nextInt();
			System.out.println(find(0, A.length, check));
		}
	}
}