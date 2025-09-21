import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        odd.sort(Collections.reverseOrder());

        int evenIndx = 0, oddIndx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(evenIndx++);
            } else {
                nums[i] = odd.get(oddIndx++);
            }
        }
        
        return nums;
    }
}
