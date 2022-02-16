package code1096;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[19][19];
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			board[x-1][y-1]=1;
		}
		
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				System.out.printf("%d ",board[i][j]);
				
			}
			System.out.println();
		}
		
		sc.close();
	}

}
