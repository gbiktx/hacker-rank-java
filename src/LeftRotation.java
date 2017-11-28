import java.util.Scanner;

/**
 * A left rotation operation on an array of size shifts each of the array's elements unit to the left.
 * For example, if left rotations are performed on array , then the array would become.
 *
 * Given an array of integers and a number, , perform left rotations on the array.
 * Then print the updated array as a single line of space-separated integers.
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }

    public static int[] arrayLeftRotation(int[] array, int n, int k) {
        if (n != k) {
            array = shift(array, n, k);
        }
        return array;
    }

    public static int[] shift(int[] a, int n, int k) {
        int[] b = new int[n];
        int x = 0;
        for (int i = k; i < n; i++) {
            b[x] = a[i];
            x++;
        }

        for (int j = 0; j < k; j++) {
            b[x] = a[j];
            x++;
        }
        return b;
    }
}
