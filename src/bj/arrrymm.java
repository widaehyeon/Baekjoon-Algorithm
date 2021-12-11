package bj;

import java.util.Scanner;
public class arrrymm {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	int count;
	count = sc.nextInt();
	int[] num = new int[count];
	
	for(int i=0; i<count; i++) {
		num[i] = sc.nextInt();
	}
	sc.close();
	
	int max = num[0];
	int min = num[0];
	for(int i=0; i< num.length; i++) {
		if(num[i]>max) {
			max = num[i];	
		}
		if(num[i]<=min) {
			min = num[i];
		}
	}
	System.out.print(min+" "+max);
	}
	}
