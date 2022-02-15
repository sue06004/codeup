package code1051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(b>=a) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		sc.close();
	}

}
