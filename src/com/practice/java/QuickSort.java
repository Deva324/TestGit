package com.practice.java;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = new int[] { 2, 5, 1, 8, 3 };
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	private static void quickSort(int[] a, int left, int right) {
		if (left < right) {
			int pivot = findPivot(a, left, right);
			quickSort(a, left, pivot - 1);
			quickSort(a, pivot + 1, right);

		}

	}

	private static int findPivot(int[] a, int low, int high) {
		int left = low, right = high, pivot = a[low];
		while (left < right) {
			while (a[left] <= pivot) {
				left++;
			}
			while (a[right] > pivot) {
				right--;
			}
			if (left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}
		}
		a[low] = a[right];
		a[right] = pivot;
		return right;
	}

}
