package sortroutines;

import runtime.Sorter;

import java.util.Arrays;

/**
 * This is the slowest version of BubbleSort
 * No optimization for already sorted arrays.
 * Doesn't take into account the fact that
 * largest elements are pushed to the right.
 */
public class BubbleSort2 extends Sorter {

    int[] arr;

    public int[] sort(int[] array) {
        this.arr = array;
        bubbleSort();
        return arr;

    }

    boolean isSwap = true;

    private void bubbleSort() {
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            if (isSwap) {
                isSwap = false;
                for (int j = 0; j < len - i - 1; ++j) {
                    if (arr[j] > arr[j + 1]) {
                        swap(j, j + 1);
                    }

                }
            }
        }
    }

    int[] swap(int i, int j) {
        isSwap = true;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;

    }

    public static void main(String[] args) {
        int[] test = {21, 13, 1, -22, 51, 5, 18};
        BubbleSort2 bs = new BubbleSort2();

        System.out.println(Arrays.toString(bs.sort(test)));

    }

}
