package bj;
import java.util.Scanner;

public class max1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[9];
		
		for(int i = 0; i< num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		int max = num[0];
		int count = 0;
		
		for(int i = 0; i<num.length; i++) {
			if(num[i] >= max) {
				max = num[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.print(count);
	}
}
