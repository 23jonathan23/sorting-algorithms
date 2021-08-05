package Selection;

public class HeapSort {
	public static void sort(int array[]) {
		int arraySize = array.length;

		for (int i = arraySize / 2 - 1; i >= 0; i--) {
			heapify(array, arraySize, i);
		}

		for (int i= arraySize - 1; i>=0; i--) {
			int tempValue = array[0];

			array[0] = array[i];
			array[i] = tempValue;

			heapify(array, i, 0);
		}
	}

	private static void heapify(int array[], int n, int i)
	{
		int major = i;
		int leftPosition = 2*i + 1;
		int rightPosition = 2*i + 2;

		if (leftPosition < n && array[leftPosition] > array[major])
			major = leftPosition;

		if (rightPosition < n && array[rightPosition] > array[major])
			major = rightPosition;

		if (major != i) {
			int swap = array[i];

			array[i] = array[major];
			array[major] = swap;

			heapify(array, n, major);
		}
	}
}

//Algoritimo de usado como referência se encontra em: https://www.geeksforgeeks.org