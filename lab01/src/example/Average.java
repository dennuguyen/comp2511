package example;

import java.util.stream.IntStream;

public class Average {
    /**
     * Returns the average of an array of numbers
     * 
     * @param nums array of integer numbers
     * @return average of the numbers
     */
    public static float average(int[] nums) {
        return (float) IntStream.of(nums).sum() / nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5};
        System.out.println(average(nums));
    }
}
