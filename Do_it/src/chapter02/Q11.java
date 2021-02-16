package chapter02;

import java.util.Scanner;

public class Q11 {
	int y;
	int m;
	int d;
	
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, 
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	public Q11(int y, int m, int d) {
		super();
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	Q11 after(int n) {
		Q11 temp = new Q11(this.y, this.m, this.d);
		if (n < 0)
			return (before(-n));

		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}
	
	Q11 before(int n) {
		Q11 temp = new Q11(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;

		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("날짜를 입력하세요.");
		System.out.print("년：");
		int y = sc.nextInt();
		System.out.print("월：");
		int m = sc.nextInt();
		System.out.print("일：");
		int d = sc.nextInt();
		Q11 date = new Q11(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = sc.nextInt();

		Q11 d1 = date.after(n);
		System.out.println(n + "일 뒤의 날짜는 " + d1.y + "년 " + d1.m + "월 " + d1.d + "일 입니다.");

		Q11 d2 = date.before(n);
		System.out.println(n + "일 앞의 날짜는 " + d2.y + "년 " + d2.m + "월 " + d2.d + "일 입니다.");
	}

}
