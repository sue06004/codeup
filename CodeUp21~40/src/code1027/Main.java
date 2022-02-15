package code1027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] arrDate = date.split("\\.");
		int year,month,day;
		year=Integer.parseInt(arrDate[0]);
		month=Integer.parseInt(arrDate[1]);
		day=Integer.parseInt(arrDate[2]);
		System.out.printf("%02d-%02d-%04d",day,month,year);
		sc.close();
		
	}

}
