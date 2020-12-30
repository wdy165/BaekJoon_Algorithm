package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] N = new int[7];
		int[] odd = new int[7];
		int sum = 0;
		int min = 0;
		int j = 0;
		for(int i = 0; i < 7; i++) {
			N[i] = Integer.parseInt(br.readLine());
			if(N[i] % 2 == 1) {
				sum += N[i];
				odd[j++] = N[i];
			}
		}
		Arrays.sort(odd);
		
		for(int i = 0; i < odd.length; i++) {
			if(odd[i] != 0) {
				min = odd[i];
				break;
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}
	}
}