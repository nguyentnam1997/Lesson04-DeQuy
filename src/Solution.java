import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        return nums[i] + sum(nums, i++);
    }

    static int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public int findTheWinner(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }
        return findTheWinner1(nums, k);
    }
    public int findTheWinner1(List<Integer> nums, int k) {
        if (nums.size() == 1) {
            return nums.get(0);
        } else {
            int count = 0;
            int index = 0;
            for (int i = 0; i <= nums.size(); i++) {
                count++;
                if (i == nums.size()) i = 0;
                if (count == k) {
                    index = i;
                    List<Integer> tmpArr = new ArrayList<>(nums);
                    nums.clear();
                    for (int j = i + 1; j <= tmpArr.size(); j++) {
                        if (j == tmpArr.size()) j = 0;
                        if (j == index) break;
                        else {
                            nums.add(tmpArr.get(j));
                        }
                    }
                    break;
                }
            }
        }
        return findTheWinner1(nums, k);
    }
}
