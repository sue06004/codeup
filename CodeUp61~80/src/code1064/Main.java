package code1064;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		System.out.println((a>b ? b:a) > c ? c:(a>b? b:a));
		
		sc.close();
	}

}
