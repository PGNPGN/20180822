package sse;

import java.util.Scanner;

public class G4 {
	Scanner scan = new Scanner(System.in);
	int testcase;
	int num;
	int[] map = {1, 2, 4, 8, 16, 32, 64};
	int sol;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G4 obj = new G4();
		obj.getInput();
	}
	
	public void getInput() {
		testcase = scan.nextInt();
		for(int i=0; i<testcase; i++) {
			num = scan.nextInt();
			dfs(0, 0);
			System.out.println(sol);
			sol=0;
		}
	}

	private void dfs(int sum, int n) {
		// TODO Auto-generated method stub
		if(sum==num) {
			sol++;
			return;
		}
		if(sum>num) {
			return;
		}
		if(n > 6) {
			return;
		}
		
		for(int i=0; i<(num/map[n])+1; i++) {
			if(sum + map[n]*i > num){
				break;
			}
			dfs(sum+map[n]*i, n+1);
			
		}
	}
}
