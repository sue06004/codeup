package code1089;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,d,n;
		a=sc.nextInt();
		d=sc.nextInt();
		n=sc.nextInt();
		
		System.out.println(a+d*(n-1));
		
		sc.close();
	}

}
