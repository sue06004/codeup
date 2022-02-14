package code1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num= sc.nextLine();
		String[] Arraynum = num.split("-");
		System.out.println(Arraynum[0]+Arraynum[1]);
		sc.close();
	}

}
