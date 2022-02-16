package code1090;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a,r,n;
		a=sc.nextLong();
		r=sc.nextLong();
		n=sc.nextLong();
		
		for(int i=0;i<n-1;i++) {
			a*=r;
		}
		System.out.println(a);
		
		sc.close();
	}

}
