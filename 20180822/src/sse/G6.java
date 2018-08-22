package sse;

import java.util.Scanner;

public class G6 {
	Scanner scan = new Scanner(System.in);
	int num;
	int pair_num ;
	int[][] map;
	int[] virus;
	int cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G6 obj = new G6();
		obj.getInput();
		obj.spread_virus(1);
		obj.check();
		
	}
	
	public void check() {
		for(int i:virus) {
			if(i==1) {
				cnt++;
			}
		}
		if(cnt == 0)
			System.out.println(0);
		else
			System.out.println(cnt-1);

	}
	public void spread_virus(int index) {
		

		for(int i=0; i<pair_num*2; i++) {
			if(virus[map[i][0]] == 1 && virus[map[i][1]] == 1) continue;
			if(map[i][0] == index) {
				virus[map[i][0]] = 1;
//				for(int k:virus) {
//					System.out.print(k+" ");
//				}
//				System.out.println();
					
				spread_virus(map[i][1]);
			}
		}
	}
	
	
	public void getInput() {
		num = scan.nextInt();
		pair_num = scan.nextInt();
		virus = new int[num+1];
		map = new int[pair_num*2][2];
		
		for(int i=0; i<pair_num; i++) {
			for(int j=0; j<2; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		for(int i=pair_num; i<pair_num*2; i++) {
				map[i][0] = map[i-pair_num][1];
				map[i][1] = map[i-pair_num][0];
		}
		
//		for(int i=0; i<pair_num*2; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}
