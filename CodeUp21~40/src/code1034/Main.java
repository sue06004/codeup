package code1034;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String i = sc.nextLine();
		System.out.println(Integer.parseInt(i,8));
		
		sc.close();
	}

}
