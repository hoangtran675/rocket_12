package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] a = {3,7,32,12,34,25};
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
