package com.practice.java;

/**
 * Best When Length of Array is less than 7
 * 
 * @author dgadiam
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		Integer[] a = new Integer[] { 4, 1, 6, 3, 5, 2 };
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && ((Comparable) a[j - 1]).compareTo(a[j]) > 0; j--) {
				Integer t = a[j - 1];
				a[j - 1] = a[j];
				a[j] = t;

			}
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
		Integer[] b = new Integer[] { 10, 1, 5, 2, 8, 4, 6 };
		mergeSort(b.clone(), b, 0, b.length, 0);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

	private static void mergeSort(Object[] src, Object[] dest, int low, int high, int off) {
		int length = high - low;

		// Insertion sort on smallest arrays
		if (length < 7) {
			for (int i = low; i < high; i++)
				for (int j = i; j > low && ((Comparable) dest[j - 1]).compareTo(dest[j]) > 0; j--)
					swap(dest, j, j - 1);
			return;
		}

		// Recursively sort halves of dest into src
		int destLow = low;
		int destHigh = high;
		low += off;
		high += off;
		int mid = (low + high) >>> 1;
		mergeSort(dest, src, low, mid, -off);
		mergeSort(dest, src, mid, high, -off);

		// If list is already sorted, just copy from src to dest. This is an
		// optimization that results in faster sorts for nearly ordered lists.
		if (((Comparable) src[mid - 1]).compareTo(src[mid]) <= 0) {
			System.arraycopy(src, low, dest, destLow, length);
			return;
		}

		// Merge sorted halves (now in src) into dest
		for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
			if (q >= high || p < mid && ((Comparable) src[p]).compareTo(src[q]) <= 0)
				dest[i] = src[p++];
			else
				dest[i] = src[q++];
		}
	}

	private static void swap(Object[] x, int a, int b) {
		Object t = x[a];
		x[a] = x[b];
		x[b] = t;
	}
}
