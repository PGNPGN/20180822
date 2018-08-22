package sse;

import java.util.Scanner;

public class G8 {
	Scanner scan = new Scanner(System.in);
	int num;
	char[][] map;
	int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
	int count;
	int nx, ny;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G8 obj = new G8();
		obj.getInput();
		obj.process(0, 0, 0);
	}
	
	public void process(int x, int y, int cnt) {
		nx =0; ny=0;
		print();
		
		if(x==4 && y==4) {
			if(cnt == 25-num) {
				count++;
				return;
			}
		}
		
		for(int i=0; i<4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			
			if(nx>=0&&nx<5&&ny>=0&&ny<5) {
				if(map[nx][ny]!='X' && map[nx][ny]!='*') {
					map[nx][ny] = '*';
					process(nx, ny, cnt+1);
					map[nx][ny] = ' ';
				}
			}
		}

	}
	
	
	public void getInput() {
		num = scan.nextInt();
		map = new char[5][5];
		
		for(int i=0; i<num; i++) {
			map[scan.nextInt()-1][scan.nextInt()-1] = 'X';
		}
		
		
		
	}
	public void print() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}
}
