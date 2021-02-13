package chapter01;

import java.util.Scanner;

/**
 * 십습 1-5 프로그램을 참고하여 n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로
 * 출력하는 프로그램을 작성하세요
 *
 */
public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			
			System.out.print(i);
			if(!(i == n)) {
				
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum );
	}

}
