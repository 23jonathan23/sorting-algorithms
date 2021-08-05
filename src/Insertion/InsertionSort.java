package Insertion;

public class InsertionSort {
	public static void sort(int array[])
	{
		for (int i = 1; i < array.length; ++i) {
			int key = array[i];
			int i2 = i - 1;

			while (i2 >= 0 && array[i2] > key) {
				array[i2 + 1] = array[i2];
				i2 = i2 - 1;
			}

			array[i2 + 1] = key;
		}
	}
}

//Algoritimo de usado como referência se encontra em: https://www.geeksforgeeks.org