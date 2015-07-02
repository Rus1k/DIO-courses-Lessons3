package arrays;

import java.util.Arrays;

/**
 * Created by ruslan on 30.06.2015.
 */
public class ArrayHelp {

    public int[] leftUnion(int[] leftArray, int[] rightArray) {
        int[] result = new int[leftArray.length + rightArray.length];
        result = Arrays.copyOf(leftArray, result.length);
        int sumInt = 0;
        for (int i = 0; i < rightArray.length; i++) {
            for (int j = 0; j < leftArray.length; j++) {
                if (rightArray[i] == leftArray[j]) {
                    result[leftArray.length + (sumInt++)] = rightArray[i];
                }
            }
        }
        result = Arrays.copyOfRange(result, 0, leftArray.length + sumInt);
        return result;

    }

}
