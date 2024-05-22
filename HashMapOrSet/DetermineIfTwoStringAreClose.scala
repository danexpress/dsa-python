object Solution {
  def closeStrings(word1: String, word2: String): Boolean =
    (word1.size == word2.size) && {
      val fm1 = freqMap(word1)
      val fm2 = freqMap(word2)
      (fm1.keys == fm2.keys) &&
      (frequencies(fm1) diff frequencies(fm2)).isEmpty
    }

  def freqMap(s: String): Map[Char, String] =
    s.groupBy(identity)

  def frequencies(freqMap: Map[Char, String]): List[Int] =
    freqMap.values.map(_.size).toList
}
