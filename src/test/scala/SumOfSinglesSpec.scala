import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "SumOfSingles" must {

    "return the sum of 15 when given a list of 7,8" in {
      SumOfSingles.sum(List(7,8)) mustEqual 15
    }

    "return then sum of 15 when given a list of 4,4,5,5,7,8" in {
      SumOfSingles.sum(List(4,4,5,5,7,8)) mustEqual 15
    }

    "return the sum of 9 when given a list of 1,1,2,2,3,3,4,5" in {
      SumOfSingles.sum(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }

  }

}
