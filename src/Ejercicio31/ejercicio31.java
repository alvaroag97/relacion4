package Ejercicio31;

public class ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6, 7, 8 };
		int[] c = concatenarrayspro(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	public static int[] concatenarrayspro(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[i];
			} else if (i >= a.length) {
				c[i] = b[i-a.length];
			}
		}
		return c;

	}

}
