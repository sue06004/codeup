package code1045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println((long)a+(long)b);
		System.out.println(a-b);
		System.out.println((long)a*(long)b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%.2f",a/(float)b);
	}

}
