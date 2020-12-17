package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		if(N >= 1 && N <= 1000) {
			for(int i = 0; i < N; i++) {
				for(int j = i+1; j < N; j++) {
					if(arr[i] > arr[j]) {
						int tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}
}
