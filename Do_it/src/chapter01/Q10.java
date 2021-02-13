package chapter01;

import java.util.Scanner;

/**
 * 오른쪽과 같이 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
 * a의 값 : 6
 * b의 값 : 6
 * a보다 큰 값을 입력하세요
 * b의 값 : 8
 * b - a는 2입니다
 *
 */
public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int b;
		do {
			System.out.print("정수 입력 : ");
			b = sc.nextInt();
			if(a >= b)
			System.out.println("a보다 큰 값을 입력하세요");
		} while (b <= a);
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}

}
