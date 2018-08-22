package sse;

import java.util.Scanner;

public class G5 {
	Scanner scan = new Scanner(System.in);
	int num;
	int[][] map;
	int max;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G5 obj = new G5();
		obj.getInput();
		obj.dfs(0,0,0,0,0);
		System.out.println(obj.max);
	}
	
	public void dfs(int n, int R, int B, int Y, int cnt) {
		if( R>map[0][1] || B>map[0][2] || Y>map[0][3]) {
			return;
		}
		if(n == num) {
			
//			System.out.println(n+" "+R+" "+B+" "+Y+" "+cnt);
			if(cnt>max) {
				max = cnt;
			}
			return;
		}
		
		
		for(int i=0; i<=3; i++) {
			dfs(n+1, R+map[n+1][1]*i, B+map[n+1][2]*i, Y+map[n+1][3]*i, cnt+i);
		}
	}
	
	public void getInput() {
		num = scan.nextInt();
		map = new int[num+1][4];
		
		map[0][1] = scan.nextInt();
		map[0][2] = scan.nextInt();
		map[0][3] = scan.nextInt();
		
		for(int i=1; i<num+1; i++) {
			for(int j=1; j<4; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
//		for(int i=0; i<num+1; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}
