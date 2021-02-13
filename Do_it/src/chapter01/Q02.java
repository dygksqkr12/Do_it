package chapter01;

/**
 * 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
 * static int min3(int a, int b, int c)
 *
 */
public class Q02 {

	public static void main(String[] args) {
		System.out.println(min3(1,3,2));
		System.out.println(min3(4,5,1));
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		return min;
		
	}

}


