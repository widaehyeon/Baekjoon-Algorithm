package bj;
import java.util.Scanner;

public class average {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt(); // ����� �Է� �ޱ�; ���񰳼��� N
	double score[] = new double[N]; //������� �´� �迭 ����
	
	for(int i = 0; i<score.length; i++) { // �迭�� �����Է�
		score[i] = sc.nextInt();
	}
	sc.close();
	double M = score[0];	// �ִ� ���ϱ�; M=�ִ�
	for(int j=0; j<score.length; j++) {
		if(score[j]>M) {
			M = score[j];
		}
	}
	for(int k = 0; k<score.length; k++) {
		score[k] = (score[k]/M)*100;
	}
	double sum = 0;
	for(int y = 0; y<score.length; y++) {
		sum += score[y];
	}
	double AVG = sum/N;
	System.out.print(AVG);
}
}
