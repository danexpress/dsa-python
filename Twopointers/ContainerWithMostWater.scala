object Solution {
  def maxArea(height: Array[Int]): Int = {
    var best = 0
    var i = 0
    var k = height.length - 1

    while (k > i) {
      var area = math.min(height(i), height(k)) * (k - i)
      if (area > best) best = area

      if (height(i) < height(k)) i += 1
      else k -= 1
    }
    best

  }
}
