import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    static void display(int[] nums, int i) {
        if (i == nums.length) {
            return;
        }
        System.out.println("nums[" + i + "] = " + nums[i]);
        display(nums, i++);
    }
    static int sum(int[] nums, int i) {
        if (i == nums.length - 1) {
            return nums[nums.length - 1];
        }
        return nums[i] + sum(nums, i++) ;
    }
    static int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        return fib(n - 1) + fib (n - 2);
    }
    public int findTheWinner(int n, int k) {
        List<Integer> nums = createArr(n);
        if (nums.size() == 1) return nums.get(0);
        int index = k - 1;
        for (int number : nums) {
            if (nums.indexOf(number) % index ) {

            }
        }
    }
    public List<Integer> createArr(int n) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }
        return nums;
    }
}
