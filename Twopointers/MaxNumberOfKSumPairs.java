package Twopointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int res = 0;

        while (left < right) {
            if (nums[left] + nums[right] == k) {
                res++;
                left++;
                right--;

            } else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }

        }
        return res;
    }

}
