package code1024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] Arraystr = str.split("");
		for(String s:Arraystr) {
			System.out.println("\'"+s+"\'");
		}
		sc.close();
	}

}
