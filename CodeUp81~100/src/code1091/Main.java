package code1091;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a,m,d,n;
		a=sc.nextLong();
		m=sc.nextLong();
		d=sc.nextLong();
		n=sc.nextLong();
		
		for(int i=0;i<n-1;i++) {
			a=a*m+d;
		}
		System.out.println(a);
		sc.close();
	}

}
