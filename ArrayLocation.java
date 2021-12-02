package Week.day2;

import java.util.Arrays;

public class ArrayLocation {

	public static void main(String[] args) {
		int a[] = { 100, 49, 398, 34, 1, 267 };
		int b = a.length;
		Arrays.sort(a);
		for (int i = 0; i < b; i++) {
			System.out.println(a[i]);
		}

		System.out.println("The largest number : " + a[b - 1]);
		System.out.println("The Second largest number : " + a[b - 2]);
		System.out.println("The Smallest number : " + a[0]);
		System.out.println("The Second smallest number : " + a[1]);
	}

}
