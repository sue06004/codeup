package code1078;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int x = sc.nextInt();
		int result=0;
		
		for(int i=0;i<=x;i++) {
			if(i%2==0) {
				result+=i;
			}
		}
		System.out.println(result);
		
		sc.close();
	}

}
