package chapter01;

/**
 * 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요
 *
 */
public class Q12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j);
			}
			System.out.println();
		}
	}

}
