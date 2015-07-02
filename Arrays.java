package arrays;

/**
 * Created by ruslan on 30.06.2015.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] mas1 = {1, 5, 4, 23, 65, 32, 78};
        int[] mas2 = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        ArrayHelp ah = new ArrayHelp();

        int[] mas3 = ah.leftUnion(mas1, mas2);  // Use case for left union.

        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
        }

    }
}
