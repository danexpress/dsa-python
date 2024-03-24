package SlidingWindow;

public class LongestSubarrayofAfterDeleting {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int numZero = 1;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                numZero--;
            }
            if (numZero < 0) {
                if (nums[left] == 0) {
                    numZero++;
                }
                left++;
            }
        }
        return right - left - 1;
    }
}
