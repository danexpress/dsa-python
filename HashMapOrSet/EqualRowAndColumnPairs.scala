object Solution {
  def equalPairs(grid: Array[Array[Int]]): Int = {
    val asList = grid.map(_.toList).toList
    val rowsMap = asList.groupBy(identity).view.mapValues(_.size).toMap

    (0 until asList.size)
      .map(j => rowsMap.getOrElse(grid.map(_(j)).toList, 0))
      .sum

  }
}
