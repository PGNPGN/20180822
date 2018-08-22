package sse;

import java.util.Arrays;
import java.util.Scanner;

public class G7 {
	Scanner scan = new Scanner(System.in);
	int num;
	int color_num;
	int[][] map;
	int[] color;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G7 obj = new G7();
		obj.getInput();
		obj.process();
		for(int i=0; i<obj.num; i++) {
			System.out.print(obj.color[i]+" ");
		}
	}
	
	
	public void process(int n) {
		
		if(n>num) {
			return;
		}
		
		
		for(int i=1; i<=color_num; i++) {
			if(check(n, i)==1) {
				continue;
			}
		
		process(n+1);
	}
	private int check(int n, int i) {
		for(int j=0; j<n; j++) {
			if(color[j] == i) {
				return 1;
			}
			color[j]=1;
		}
		return 0;
	}


	public void getInput() {
		num = scan.nextInt();
		color_num = scan.nextInt();
		map = new int[num][num];
		color = new int[num];
		Arrays.fill(color, 1);
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
	}
}
