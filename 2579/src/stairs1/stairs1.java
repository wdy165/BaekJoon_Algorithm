package stairs1;
import java.util.Scanner;

public class stairs1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] stairs = new int[N+1];
		int[] TotalMax = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			stairs[i] = scan.nextInt();
		}
		
		TotalMax[1] = stairs[1];
		if(N >= 2) {
			TotalMax[2] = stairs[1] + stairs[2];
		}
		for(int i = 3; i <= N; i++) {
			TotalMax[i] = Math.max(TotalMax[i-3]+stairs[i]+stairs[i-1],
					TotalMax[i-2]+stairs[i]);
		}
		System.out.println(TotalMax[N]);
	}
}
