import java.util.Scanner;

/**
 * Consider the following version of Bubble Sort:
 *
 * for (int i = 0; i < n; i++) {
 *   Track number of elements swapped during a single array traversal
 *   int numberOfSwaps = 0;
 *
 *   for (int j = 0; j < n - 1; j++) {
 *     // Swap adjacent elements if they are in decreasing order
 *     if (a[j] > a[j + 1]) {
 *       swap(a[j], a[j + 1]);
 *       numberOfSwaps++;
 *     }
 *   }
 *     // If no elements were swapped during a traversal, array is sorted
 *     if (numberOfSwaps == 0) {
 *       break;
 *     }
 * }
 *
 * Given an n-element array of distinct elements,
 * sort array in ascending order using the Bubble Sort algorithm above.
 * Once sorted, print the following three lines:
 *
 * Array is sorted in numSwaps swaps., where numSwaps is the number of swaps that took place.
 * First Element: firstElement, where firstElement is the first element in the sorted array.
 * Last Element: lastElement, where lastElement is the last element in the sorted array.
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = in.nextInt();
        }

        boolean isSorted = false;
        int swapsCount = 0;
        int individualSwaps;

        while (!isSorted) {
            individualSwaps = doTraversal(array, size);
            swapsCount += individualSwaps;
            isSorted = individualSwaps == 0;
        }

        System.out.println("Array is sorted in " + swapsCount + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.printf("Last Element: %d", array[size - 1]);
    }

    public static int doTraversal(int array[], int size) {
        int swaps = 0;
        int element;
        int nextIndex;
        for (int i = 0; i < size; i++) {
            nextIndex = i + 1;
            if (nextIndex < size && array[i] > array[nextIndex]) {
                element = array[i];
                array[i] = array[i + 1];
                array[i + 1] = element;
                swaps++;
            }
        }
        return swaps;
    }

}
