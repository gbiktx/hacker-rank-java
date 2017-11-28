import java.util.Scanner;

/**
 * A left rotation operation on an array of size n shifts each of the array's elements unit to the left.
 * For example, if left rotations are performed on array [1,2,3,4,5] , then the array would become [3,4,5,1,2]
 *
 * Given an array of integers and a number, , perform left rotations on the array.
 * Then print the updated array as a single line of space-separated integers.
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int rotations = in.nextInt();
        int a[] = new int[size];
        for(int i=0; i < size; i++){
            a[i] = in.nextInt();
        }

        int[] output = new int[size];
        output = leftRotateArray(a, size, rotations);
        for(int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();

    }

    public static int[] leftRotateArray(int[] array, int size, int rotations) {
        if (size != rotations) {
            array = shift(array, size, rotations);
        }
        return array;
    }

    public static int[] shift(int[] originalArray, int size, int rotations) {
        int[] finalArray = new int[size];
        int x = 0;
        for (int i = rotations; i < size; i++) {
            finalArray[x] = originalArray[i];
            x++;
        }

        for (int j = 0; j < rotations; j++) {
            finalArray[x] = originalArray[j];
            x++;
        }
        return finalArray;
    }
}
