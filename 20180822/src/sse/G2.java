package sse;

import java.util.Scanner;

public class G2 {
	
	Scanner scan = new Scanner(System.in);
	int max_distance;
	int num;
	int[] dis_array;
	int[] time_array;
	int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G2 obj = new G2();
		obj.getInput();
		obj.process(obj.dis_array[0], 0, 0);
		System.out.println(obj.min);
		
		
	}
	
	public void process(int dis, int time, int n) {
			
//		System.out.println("Now, dis= "+dis+" time= "+time+" n= "+n);
		if(time>min) {
			return;
		}
		if(dis>max_distance) {
			return;
		}
		if(n == num) {
			if(time < min) {
				min = time;
			}
			return;
		}
		
//		System.out.println("Go to fix, dis= "+dis+" time= "+time+" n= "+n);
		process(dis_array[n+1], time + time_array[n], n+1);
//		System.out.println("GO to road, dis= "+dis+" time= "+time+" n= "+n);
		process(dis + dis_array[n+1], time, n+1);


	}
	
	public void getInput() {
		max_distance= scan.nextInt();
		num = scan.nextInt();
		dis_array = new int[num+1];
		time_array = new int[num];
		
		for(int i=0; i<num+1; i++) {
			dis_array[i] = scan.nextInt();
		}
		for(int i=0; i<num; i++) {
			time_array[i] = scan.nextInt();
		}
	}
}
