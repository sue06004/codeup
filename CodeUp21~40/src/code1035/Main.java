package code1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		int i = Integer.valueOf(x,16);
		System.out.printf("%o",i);
		
		sc.close();
	}

}
