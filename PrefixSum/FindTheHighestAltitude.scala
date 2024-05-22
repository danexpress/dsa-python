object Solution {
  def largestAltitude(gain: Array[Int]): Int = {
    gain.scanLeft(0)(_ + _).max

  }
}
