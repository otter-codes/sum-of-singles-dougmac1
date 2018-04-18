object SumOfSingles {

  def sum(numbers: List[Int]): Int = {

    val set = numbers.distinct
    val removalOfNumber = numbers.diff(set)
    val updatedList = set.diff(removalOfNumber)
    updatedList.sum

  }

}
