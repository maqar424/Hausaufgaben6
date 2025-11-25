package h3;

import java.util.Arrays;

public class H3_main {
	public static void main(String[] args) {

		int[] a={1,2,3};
		int[] b={1,2,4};
		int[] c={1,3,2};
		int[] d={1,2};
		int[] e={1,2,3};
		int[] f={1,1,2};
		
		
		
		
	}

	public static boolean compareArraysVal(int[] a, int[] b) {
		
		return Arrays.equals(miniSort(a), miniSort(b));
	}
	
	
	public static int[] miniSort(int[] b) {
		int[] numbers = {0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0; i < b.length; i++) {
			numbers[b[i]] = numbers[b[i]]+ 1;
		}
		
		
		return numbers;
	}
}
