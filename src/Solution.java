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

}
