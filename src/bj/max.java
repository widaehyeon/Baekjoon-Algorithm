package bj;

import java.util.Scanner;

public class max {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = A*B*C;
		sc.close();
		
		String R = String.valueOf(result); //A B C을 곱한 값을 문자열로
		int R_len = R.length();  //A B C 곱한 값의 길이(배열생성시 사용)
		String num[] = R.split(""); //배열에 문자열 입력
		
		int zero, one, two, three, four, five, six, seven, eight, nine;
		zero = 0;
		one = 0;
		two = 0;
		three = 0;
		four = 0;
		five = 0;
		six = 0;
		seven = 0;
		eight = 0;
		nine = 0;
		
		for(int i=0; i<R_len; i++) {
			if(num[i].equals("0")) {
				zero++;
			} else if(num[i].equals("1")) {
				one++;
			} else if(num[i].equals("2")) {
				two++;
			} else if(num[i].equals("3")) {
				three++;
			} else if(num[i].equals("4")) {
				four++;
			} else if(num[i].equals("5")) {
				five++;
			} else if(num[i].equals("6")) {
				six++;
			} else if(num[i].equals("7")) {
				seven++;
			} else if(num[i].equals("8")) {
				eight++;
			} else {
				nine++;
			}
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
		}
	}
