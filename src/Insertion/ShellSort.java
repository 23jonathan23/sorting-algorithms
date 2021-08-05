package Insertion;

public class ShellSort {
	public static void sort(int array[])
	{
		int arraySize = array.length;

		for (int gap = arraySize/2; gap > 0; gap /= 2) {
			for (int i = gap; i < arraySize; i += 1) {
				int tempValue = array[i];

				int i2;
				for (i2 = i; i2 >= gap && array[i2 - gap] > tempValue; i2 -= gap) {
					array[i2] = array[i2 - gap];
				}

				array[i2] = tempValue;
			}
		}
	}
}

//Algoritimo usado como referência se encontra em: https://www.geeksforgeeks.org