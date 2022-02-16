package code1084;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r,g,b;
		r=sc.nextInt();
		g=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
		System.out.println(r*g*b);
		
		sc.close();
	}

}
