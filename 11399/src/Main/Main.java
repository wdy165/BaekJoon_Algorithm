package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int DrawTime[] = new int[N+1];
		int sum = 0;
		int min = 0;
		
		if(N >= 1 && N <= 1000) {
			for(int i = 1; i <= N; i++) {
				DrawTime[i] = scan.nextInt();
			}
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = i+1 ; j <= N; j++) {
				if(DrawTime[i] > DrawTime[j]) {
					int tmp = DrawTime[j];
					DrawTime[j] = DrawTime[i];
					DrawTime[i] = tmp;
				}
			}
		}
	
		for(int i = 1; i <= N; i++) {
			min += DrawTime[i];
			sum += min;
		}
		System.out.println(sum);
	}
}
