package code1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a);
		}
		if(b%2==0) {
			System.out.println(b);
		}
		if(c%2==0) {
			System.out.println(c);
		}
		
		sc.close();
	}

}
