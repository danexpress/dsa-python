object Solution {
  def reverseWords(s: String): String = {

    val arr = s.trim.split(" ")

    val reversed = arr.map(w => w.trim).reverse

    reversed.filter(w => !w.isEmpty).mkString(" ")

  }
}
