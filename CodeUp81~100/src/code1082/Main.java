package code1082;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int n = Integer.valueOf(s,16);
		
		for(int i=1;i<16;i++) {
			System.out.printf("%X*%X=%X\n",n,i,n*i);
		}
		
		sc.close();
	}

}
