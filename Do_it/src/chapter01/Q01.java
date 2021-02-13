package chapter01;

/**
 * 네 값의 최댓값을 구하는 max4메서드를 작성하세요
 * static int  max4(int a, int b, int c, int d)
 *
 */
public class Q01 {
	public static void main(String[] args) {
		System.out.println(max4(1, 3, 4, 2));
		System.out.println(max4(2, 5, 1, 3));
	}
	
public static int max4(int a, int b,  int c, int d) {
	int max = a;
	if(b > max)
		max = b;
	if(c > max)
		max = c;
	if(d > max)
		max = d;
	return max;
	
}
}
