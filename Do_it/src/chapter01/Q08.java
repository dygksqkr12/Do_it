package chapter01;

import java.util.Scanner;

/**
 * 1부터 10까지의 합은 (1 + 10) * 5와 같은 방법으로 구할 수 있습니다. 가우스의 덧셈이라는 방법을
 * 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
 *
 */
public class Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		
		System.out.println((1 + n) * n / 2);
		
	}

}
