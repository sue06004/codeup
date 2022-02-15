package code1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		String nums = sc.nextLine();
		String[] arr = nums.split(" ");
		
		for(int i=0; i< arr.length ;i++) {
			if( arr[i].equals("0")) {
				break;
			}
			System.out.println(arr[i]);
			
		}
		sc.close();
	}

}
