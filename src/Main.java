import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //int[] nums = {1,2,3,4};
        //System.out.println(Solution.sum(nums, 0));

        //fibonaci
        //System.out.println(Solution.fib(50));

//        List<Integer> nums = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            nums.add(i + 1);
//        }
//        System.out.println(Arrays.toString(nums.toArray()));
        //System.out.println(0 % 1);
        Solution solution = new Solution();
        int k = 2;
        System.out.println(solution.findTheWinner(5, k));
    }
}