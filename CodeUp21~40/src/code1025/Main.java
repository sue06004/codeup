package code1025;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		String[] arraynum = number.split("");
		System.out.println("["+Integer.parseInt(arraynum[0])*10000+"]");
		System.out.println("["+Integer.parseInt(arraynum[1])*1000+"]");
		System.out.println("["+Integer.parseInt(arraynum[2])*100+"]");
		System.out.println("["+Integer.parseInt(arraynum[3])*10+"]");
		System.out.println("["+Integer.parseInt(arraynum[4])+"]");
		sc.close();
	}

}
