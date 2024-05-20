object Solution {
  def maxOperations(nums: Array[Int], k: Int): Int = {
    var left = 0
    var right = nums.length - 1
    var count = 0
    val sorted = nums.sorted

    while (left < right) {

      if (sorted(left) + sorted(right) == k) {
        left = left + 1
        right = right - 1
        count = count + 1
      } else if (sorted(left) + sorted(right) < k) {
        left = left + 1
      } else {
        right = right - 1
      }
    }

    count
  }
}
