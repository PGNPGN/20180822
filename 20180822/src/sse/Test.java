package sse;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {1,2,3,4};
			int[] b;
			
			b = a.clone();
			for(int i=0; i<4; i++) {
				System.out.println(b[i]);	
			}
			
			
			a[3] = 5;
			
			for(int i=0; i<4; i++) {
				System.out.println(a[i]);	
			}
			for(int i=0; i<4; i++) {
				System.out.println(b[i]);	
			}
	}

}
