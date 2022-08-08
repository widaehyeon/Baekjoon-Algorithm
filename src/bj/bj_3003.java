package bj;
import java.util.Scanner;

public class bj_3003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int original [] = {1,1,2,2,2,8};
		int discovery[] = new int[original.length];
			
		for(int i=0 ; i<discovery.length ; i++) {
			discovery[i] = scanner.nextInt();
	}
		scanner.close();
		for(int j=0 ; j<discovery.length ; j++) {
			System.out.print(original[j]-discovery[j] + " ");
		}	
	}
}