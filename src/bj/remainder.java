package bj;
import java.util.Scanner;

public class remainder {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		for(int j = 0; j < num.length; j++) {
			num[j] %= 42;
		}
		int differ = 10;
		for(int b = 0; b < num.length; b++) {
			for(int f = (b+1); f<num.length; f++) {
				if(num[b]==num[f]) {
					differ--;
					break;
				}
			}
		}
		System.out.print(differ);
	}

}
