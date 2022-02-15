package code1026;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		
		String[] arrayTime = time.split(":");
		System.out.println(Integer.parseInt(arrayTime[1]));
		
		sc.close();
	}

}
