# Given a binary array nums, you should delete one element from it.

# Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.


# Example 1:

# Input: nums = [1,1,0,1]
# Output: 3
# Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
# Example 2:

# Input: nums = [0,1,1,1,0,1,1,0,1]
# Output: 5
# Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
# Example 3:

# Input: nums = [1,1,1]
# Output: 2
# Explanation: You must delete one element.

from typing import List


class Solution:
    def longestSubarray(self, nums: List[int]) -> int:

        num_zero = 1
        l = 0

        for r in range(len(nums)):
            num_zero -= nums[r] == 0

            if num_zero < 0:
                num_zero += nums[l] == 0
                l += 1

        return r - l
