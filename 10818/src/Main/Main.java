package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = -1000000;
		int min = 1000000;
		for(int i = 0; i < N; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			if(A[i] < min) {
				min = A[i];
			}
		}
		System.out.print(min + " " + max);
	}
}
