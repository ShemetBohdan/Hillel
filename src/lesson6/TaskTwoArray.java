package lesson6;

import java.util.Arrays;

public class TaskTwoArray {

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4};
        int[] myArray1 = Arrays.copyOfRange(nums, 0, nums.length/2);// share array
        int[] myArray2 = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
        int[] myArray3 = Arrays.copyOfRange(myArray1,1,2);
        int[] myArray4 = Arrays.copyOfRange(myArray2,1,2);
        int[] myArray5 = Arrays.copyOf(myArray3, nums[0]);
        for (int i = 0; i < myArray5.length; i++) {
            if (myArray5[i] == 0) {
                myArray5[i] = nums[1];
            }
        }
        int[] r = Arrays.copyOf(myArray4,nums[2]);
        for (int i = 0; i < r.length; i++) {
            if (r[i] == 0) {
                r[i] = nums[3];
            }
        }
        int[] myArray6 = Arrays.copyOf(myArray5,r.length+myArray5.length);
        System.arraycopy(r,0,myArray6,myArray5.length,r.length);
        System.out.println(Arrays.toString(myArray6));
    }
}
