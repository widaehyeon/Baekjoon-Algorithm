package bj;
import java.util.Scanner;

public class alarmclock {

	public static void main(String[] args) {
		
		int H;
		int M;
		
		Scanner cs = new Scanner(System.in);
		H = cs.nextInt();
		M = cs.nextInt();
		
		cs.close();
		if(H!=0 && M>=45) {
			System.out.print(H+" "+(M-45));
		}else if(H!=0 && M<45) {
			System.out.print((H-1)+" "+(60+M-45));
		}else if(H==0 && M>=45) {
			System.out.print(H+" "+(M-45));
		}else {
			System.out.print(23+" "+(60+M-45));
		}
	}
}
