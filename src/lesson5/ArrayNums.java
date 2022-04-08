package lesson5;

import java.util.Arrays;

public class ArrayNums {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = new int[array.length];
        arr[0] = array[0];
        for (int i = 1; i < array.length; i++)
            arr[i] = array[i]+arr[i - 1];
        System.out.println(Arrays.toString(arr));
    }
}
