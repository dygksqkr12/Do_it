package chapter02;

import java.util.Scanner;

public class Q07 {
	// 정수 x를 r진수로 변환하여 배열 d에 아랫자리부터 저장하고 자릿수를 반환
		static int cardConvEx(int x, int r, char[] d) {
			int n = ((Integer) x).toString().length(); // 변환 전의 자릿수
			int num = 0; // 변환 뒤의 자릿수
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
			do {
				System.out.printf("   +");
				for (int i = 0; i < n + 2; i++)
					System.out.print('-');
				System.out.println();

				if (x / r != 0)
					System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
				else
					System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
				d[num++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
				x /= r;
			} while (x != 0);

			for (int i = 0; i < num / 2; i++) { // d[0]~d[digits-1]
				char temp = d[i]; // 를 역순으로 정렬
				d[i] = d[num - i - 1];
				d[num - i - 1] = temp;
			}
			return num;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int no; // 변환하는 정수
			int cd; // 기수
			int dno; // 변환 뒤의 자릿수
			int retry; // 한 번 더？
			char[] cno = new char[32]; // 변환 뒤의 각 자리를 저장하는 문자 배열

			System.out.println("10진수를 기수변환합니다.");
			do {
				do {
					System.out.print("변환하는 음이 아닌 정수：");
					no = sc.nextInt();
				} while (no < 0);

				do {
					System.out.print("어떤 진수로 변환할까요? (2~36)：");
					cd = sc.nextInt();
				} while (cd < 2 || cd > 36);

				dno = cardConvEx(no, cd, cno); // no를 cd진수로 변환

				System.out.print(cd + "진수로는 ");
				for (int i = 0; i < dno; i++) // 윗자리부터 차례로 나타냄
					System.out.print(cno[i]);
				System.out.println("입니다.");

				System.out.print("한번 더 할까요? (1.예/0.아니오)：");
				retry = sc.nextInt();
			} while (retry == 1);
		}
}
