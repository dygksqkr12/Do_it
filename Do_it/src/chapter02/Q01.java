package chapter02;

import java.util.Random;
import java.util.Scanner;

public class Q01 {
		static int maxOf(int[] a) {
			int max =a[0];
			for (int i = 0; i < a.length; i++) 
				if(a[i] > max)
					max = a[i];
				return max;
			}
		
	

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = rd.nextInt(10);
		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와같습니다.");
		for (int i = 0; i < num; i++) {
			height[i]  = 100 + rd.nextInt(90);
			System.out.println("heigth [" + i + "] : " +height[i]);
		}
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
	}
	

}
