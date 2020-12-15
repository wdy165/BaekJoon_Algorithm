package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int dp[] = new int[X+1]; // ÃÖ¼Ò È½¼ö
		
		dp[0] = 0;
		dp[1] = 0;

		if(X >= 1 && X <= 1000000) {
			for(int i = 2; i <= X; i++) {
				dp[i] = dp[i-1] + 1;
				if(i % 2 == 0) {
					dp[i] = Math.min(dp[i], dp[i/2] + 1);
				}
				if(i % 3 == 0) {
					dp[i] = Math.min(dp[i], dp[i/3] + 1);
				}
			}
		}
		System.out.println(dp[X]);
	}
}