package code1048;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=0;i<b;i++) {
			a*=2;
		}
		System.out.println(a);
		
		sc.close();
	}

}
