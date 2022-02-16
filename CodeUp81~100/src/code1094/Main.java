package code1094;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrayN = new int[10000];
		
		for(int i=0;i<n;i++) {
			arrayN[i]=sc.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			System.out.printf("%d ",arrayN[i]);
		}
		
		sc.close();
	}

}
