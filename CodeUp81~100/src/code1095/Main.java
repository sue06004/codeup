package code1095;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrayN = new int[10000];
		
		int min=23;
		
		for(int i=0;i<n;i++) {
			arrayN[i]=sc.nextInt();
			if (min>arrayN[i]) {
				min=arrayN[i];
			}
		}
		System.out.println(min);
		
		sc.close();
	}

}
