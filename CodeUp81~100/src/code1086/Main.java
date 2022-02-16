package code1086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long w,h,b;
		w=sc.nextLong();
		h=sc.nextLong();
		b=sc.nextLong();
		
		System.out.printf("%.2f MB",(float)(w*h*b/8)/1024/1024);
		
		sc.close();
	}

}
