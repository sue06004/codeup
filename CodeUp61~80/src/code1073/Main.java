package code1073;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		String nums = sc.nextLine();
		String[] arr = nums.split(" ");
		
		int i = 0;
		while(i<arr.length) {
			if( arr[i].equals("0")) {
				break;
			}
			System.out.println(arr[i]);
			i++;
		}
		sc.close();
	}

}
