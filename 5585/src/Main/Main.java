package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 1000;
	    int Coins[] = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		int pay = Integer.parseInt(br.readLine());
		
		if(pay >= 1 && pay <= 1000) {
			total -= pay;
			for(int i = 0; i <= Coins.length-1; i++) {
				if(Coins[i] <= total) {
					cnt = cnt + total/Coins[i];
					total %= Coins[i];
				}
			}
		}
		System.out.println(cnt);
	}
}