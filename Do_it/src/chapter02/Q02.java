package chapter02;

public class Q02 {

	public static void main(String[] args) {
		int[] a = {5, 10,  73, 2, -5, 42};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		int t = a[0];
		a[0] = a[5];
		a[5] = t;
		System.out.println("a[0]과 a[5]를 교환합니다.");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		t = a[1];
		a[1] = a[4];
		a[4] = t;
		System.out.println("a[1]과 a[4]를 교환합니다.");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		t = a[2];
		a[2] = a[3];
		a[3] =  t;
		System.out.println("a[2]와 a[3]을 교환합니다.");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println( );
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
