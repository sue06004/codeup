package code1023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] Arrayx = x.split("\\.");
		System.out.println(Arrayx[0]+"\n"+Arrayx[1]);
		sc.close();
	}

}
