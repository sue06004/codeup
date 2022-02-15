package code1079;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(arr[i].equals("q")) {
				break;
			}
		}
		
		sc.close();
	}

}
