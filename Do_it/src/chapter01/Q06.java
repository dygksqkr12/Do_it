package chapter01;

import java.util.Scanner;

/**
 * 실습 1-4에서 while문이 종료될 떄 변수 i 값이 n + 1이 됨을 확인하세요
 * (변수 i 값을 출력하도록 프로그램을 수정하세요.)
 *
 */
public class Q06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 :");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i;
			i++;
			System.out.println(i);
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
