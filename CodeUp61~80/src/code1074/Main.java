package code1074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x>0) {
			System.out.println(x);
			x--;
		}
		
		sc.close();
	}

}
