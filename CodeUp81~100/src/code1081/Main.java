package code1081;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.println(i+" "+j);
			}
		}
		
		sc.close();
	}

}
