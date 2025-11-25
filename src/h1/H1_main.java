package h1;

public class H1_main {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 6, 5, 4, 3, 2, 1 };

	}

	public static boolean isMirrorArray(int[] a, int[] b) {
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) { // For Schleife start
				if (!(a[i] == b[b.length - i - 1])) {
					return false; // Check for each array slot if they are equal
				}
			}

			return true;
		} else {
			return false;
		}
	}
}
