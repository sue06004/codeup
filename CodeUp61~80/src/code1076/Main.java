package code1076;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		char s = sc.nextLine().charAt(0);
		int c = (char)"a".charAt(0);
		do
		{
			System.out.printf("%c ",(char)c);
			c ++ ;
		}
		while(c<=(int)s);
		
		sc.close();
	}

}
