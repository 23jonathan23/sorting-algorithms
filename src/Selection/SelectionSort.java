package Selection;

public class SelectionSort {
	public static void sort(int array[]) {
		int arraySize = array.length;

		for (int i = 0; i < arraySize-1; i++) {
			int minIndex = i;
			
			for (int i2 = i+1; i2 < arraySize; i2++) {
				if (array[i2] < array[minIndex])
					minIndex = i2;
			}

			int tempValue = array[minIndex];
			
			array[minIndex] = array[i];
			
			array[i] = tempValue;
		}
	}
}

//Algoritimo usado como referência se encontra em: https://www.geeksforgeeks.org
