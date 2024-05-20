object Solution {
  def isVowel(c: Char) = "aeiou".contains(c)
  def maxVowels(s: String, k: Int): Int = {
    var vowelsCount = s.take(k).filter(isVowel(_)).length
    var maxVowels = vowelsCount

    for (n <- (k to s.length - 1)) {
      if (isVowel(s(n - k)))
        vowelsCount -= 1
      if (isVowel(s(n)))
        vowelsCount += 1

      maxVowels = Math.max(maxVowels, vowelsCount)
    }
    maxVowels

  }
}
