package code1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long h,b,c,s;
		h=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();
		s=sc.nextLong();
		
		System.out.printf("%.1f MB",(double)(h*b*c*s/8)/1024/1024);
		sc.close();
	}

}
