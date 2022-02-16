package code1092;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int i=1;
		while(i%a!=0||i%b!=0||i%c!=0) {
			i++;
		}
		System.out.println(i);
		sc.close();
	}

}
