package code1099;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] maze = new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		
		int x=1;
		int y=1;
		while(true) {
			if (maze[x][y]==2 || maze[x][y]==9) {
				maze[x][y]=9;
				break;
			}
			maze[x][y]=9;
			if (maze[x][y+1]!=1) {
				y++;
			}
			else if(maze[x+1][y]!=1) {
				x++;
			}
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%d ",maze[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
