package code1093;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[] arrayN= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<n;i++) {
			int idx = sc.nextInt();
			arrayN[idx]++;
		}
		
		for(int i=1;i<24;i++) {
			System.out.printf("%d ",arrayN[i]);
		}
		
		sc.close();
	}

}