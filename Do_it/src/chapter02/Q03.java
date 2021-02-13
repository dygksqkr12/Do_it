package chapter02;

import java.util.Random;

public class Q03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) { 
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] b = new int[5]; 
		
		for (int i = 0; i < 5; i++) {
			b[i]  = 100 + rd.nextInt(90);
			System.out.println(b[i]);
		}
			 
		System.out.println("합계 : " + sumOf(b));
	}

}
