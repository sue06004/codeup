package code1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		String[] Arraydate = date.split("\\."); // ([{\^-=$!|]})?*+. �� Ż�⹮�� ����Ѵ�
		int year = Integer.parseInt(Arraydate[0]);
		int month = Integer.parseInt(Arraydate[1]);
		int day = Integer.parseInt(Arraydate[2]);
		
		System.out.printf("%04d.%02d.%02d\n",year,month,day);
		sc.close();
	}

}