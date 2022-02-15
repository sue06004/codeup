package code1041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int asci = (int)s.charAt(0);
		System.out.println((char)(asci+1));
		
		sc.close();
	}

}
