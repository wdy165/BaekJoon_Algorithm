package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
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
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
	
		int check;
		Arrays.sort(A);
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			check = Integer.parseInt(st.nextToken());
			System.out.print(find(0, A.length, check) + " ");
		}
	}
}