package chapter01;

import java.util.Scanner;

/**
 * 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
 * static int sumof(int a, int b)
 */
public class Q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		for (int i = b; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
