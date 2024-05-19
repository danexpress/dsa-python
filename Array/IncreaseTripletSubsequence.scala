object Solution {
  def increasingTriplet(nums: Array[Int]): Boolean = {
    var first: Int = Int.MaxValue
    var second: Int = Int.MaxValue
    var isFind: Boolean = false

    nums.foreach(num => {
      if (!isFind) {
        first = Math.min(num, first)
        second = if (num > first) Math.min(num, second) else second
        isFind = num > second
      }
    })
    isFind
  }
}
