object Solution {
  def longestOnes(nums: Array[Int], k: Int): Int = {
    var allowedZeros = k
    var start = 0
    for (num <- nums) {
      if (num == 0) allowedZeros -= 1
      if (allowedZeros < 0) {
        if (nums(start) == 0) allowedZeros += 1
        start += 1
      }
    }
    nums.length - start
  }
}
