package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			score[i] = scan.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			if(score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		System.out.println(sum/5);
	}
}