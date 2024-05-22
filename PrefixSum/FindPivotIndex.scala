object Solution {
  def pivotIndex(nums: Array[Int]): Int = {
    var l = 0
    var r = nums.sum
    var ind = -1
    var found = false
    for (i <- nums.indices) {
      if (i > 0) l += nums(i - 1)
      r -= nums(i)
      if (r == l && !found) {
        ind = i
        found = true
      }
    }
    ind

  }
}
