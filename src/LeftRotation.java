import java.util.Scanner;

public class LeftRotation {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        if (n != k) {
            a = shift(a, n, k);
        }
        return a;
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
}
