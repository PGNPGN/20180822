package sse;

import java.util.Scanner;

public class G3 {
	Scanner scan = new Scanner(System.in);
	int money;
	int corp_num;
	int[][] map;
	int[] check_Money;
	int[] array_Money;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G3 obj= new G3();
		obj.getInput();
		obj.divide_Money(0, 0, 0);
	}

	public void divide_Money(int total_Money, int cnt, int index_Money) {
		
		System.out.println("total_Money and cnt is "+total_Money+" "+cnt);

		System.out.print("array_Money is ");
		for(int i=0; i<corp_num; i++) {
			System.out.print(array_Money[i]+" ");
		}
		System.out.println();
		
		if(cnt == corp_num) {
			if(total_Money == money) {
				System.out.println("Money is full");
				select_corp();
				return;
			}
			System.out.println("Money is not full");
			return;
		}
		
		
		
		for(int i=index_Money; i<money+1; i++) {
			if(check_Money[i] == 1) continue;
			check_Money[i] = 1;
			array_Money[cnt] = map[i][0];
			divide_Money(total_Money + map[i][0], cnt+1, i+1);
			check_Money[i] = 0;
			
		}

	}

	private void select_corp() {
		
		
	}

	public void getInput() {
		money = scan.nextInt();
		corp_num = scan.nextInt();
		map = new int[money+1][corp_num+1];
		check_Money = new int[money+1];
		array_Money = new int[corp_num];

		for(int i=1; i<money+1; i++) {
			for(int j=0; j<corp_num+1; j++) {
				map[i][j] = scan.nextInt();
			}
		}

		for(int i=1; i<money+1; i++) {
			for(int j=0; j<corp_num+1; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
