package sse;

import java.util.Scanner;

public class G3_2 {
	Scanner scan = new Scanner(System.in);
	int money;
	int corp_num;
	int[][] map;
	int[] check_Money;
	int[] array_Money;
	int[] max_array_Money;
	Node[] queue;
	int max;

	public class Node{
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G3_2 obj = new G3_2();
		obj.getInput();
		obj.select_price(0, 0, 0);
		System.out.println(obj.max);
		for(int i=0; i<obj.corp_num; i++) {
			System.out.print(obj.max_array_Money[i]+" ");
		}
	}

	public void select_price(int total, int n, int mny) {
//		System.out.println("mny = "+mny+" total = "+total+" n = "+n);
//		for(int i=0; i<corp_num; i++) {
//			System.out.print(array_Money[i]+" ");
//		}
//		System.out.println();
		if(mny > money) {
			return;
		}
		
		if(n==corp_num) {
			if(mny == money) {
//				System.out.println("-------------------------");
				if(total>max) {
					max = total;
					max_array_Money = array_Money.clone();
				}
				return;
			}
			return;
		}


		for(int i=0; i<money+1; i++) {
			array_Money[n] = i;
			select_price(total + map[i][n+1], n+1, mny+map[i][0]);
			array_Money[n] = 0;
		}
	}


	public void getInput() {
		money = scan.nextInt();
		corp_num = scan.nextInt();
		map = new int[money+1][corp_num+1];
		check_Money = new int[money+1];
		array_Money = new int[corp_num];
		max_array_Money = new int[corp_num];
		queue = new Node[corp_num];

		for(int i=1; i<money+1; i++) {
			for(int j=0; j<corp_num+1; j++) {
				map[i][j] = scan.nextInt();
			}
		}

//		for(int i=0; i<money+1; i++) {
//			for(int j=0; j<corp_num+1; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}
