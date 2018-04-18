import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "SumOfSingles" must {

    "return the sum of 15 when given a list of 7,8" in {
      SumOfSingles.sum(List(7,8)) mustEqual 15
    }

  }

}
