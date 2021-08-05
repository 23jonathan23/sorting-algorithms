import java.util.Scanner;
import Selection.*;
import Insertion.*;

public class Main {
    public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

        System.out.println(
            "Escolha o algoritimo de ordenação\n" + 
            "[1] - SelectionSort \n" +
            "[2] - HeapSort \n" +
            "[3] - InsertionSort \n" +
            "[4] - ShellSort"
        );

        int choice = scan.nextInt();

        System.out.print("Informe o tamanho do array: ");

		int maxValues = scan.nextInt();
		int array[] = new int [maxValues];

        System.out.println(
            "\nPermitir repetição de valores?\n" +
            "[1] - Permitir\n" +
            "[0] - Não Permitir"
        );

        boolean repeat = (scan.nextInt() == 1) ? true : false;

        fillArray(array, maxValues, repeat);

		long initialTime = System.currentTimeMillis();

        switch (choice) {
            case 1: 
                SelectionSort.sort(array); break;
            case 2: 
                HeapSort.sort(array); break;
            case 3: 
                InsertionSort.sort(array); break;
            case 4: 
                ShellSort.sort(array); break;
            default: 
                SelectionSort.sort(array);
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("\nTempo de ordenação: %.3f ms%n\n", (endTime - initialTime) / 1000d);
	}

    private static void fillArray(int array[], int maxValues, boolean repeat) {
        if(repeat) {
            int ninetyPercent = (int) Math.ceil((array.length - 1) * 0.9);
    
            int firstRandomNumber = getRandomNumber(maxValues);
            
            for(int i = 0; i < array.length; i++) {
                if(i < ninetyPercent)
                    array[i] = firstRandomNumber;
                else
                    array[i] = getRandomNumber(maxValues);
            }
        } else {
            for(int i = 0; i < array.length; i++) {
                array[i] = getRandomNumberWithoutRepeating(array, maxValues);
            }
        }
	}

	private static int getRandomNumber(int max) {
		return (int) Math.floor(Math.random() * (max - 1 + 1)) + 1;
	}

    public static int getRandomNumberWithoutRepeating(int array[], int maxValues) {
        int randomNumber = getRandomNumber(maxValues);

        for(int i = 0; i < array.length ; i++) {
            if(array[i] == randomNumber)
                return getRandomNumberWithoutRepeating(array, maxValues);
        }

        return randomNumber;
    }
}
