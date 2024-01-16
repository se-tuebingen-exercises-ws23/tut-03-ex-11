import munit.ScalaCheckSuite
import org.scalacheck.Prop._
import org.scalacheck.Gen
import org.scalacheck.Arbitrary
import SumIntegers.*

class SumIntegersPropertyTests extends ScalaCheckSuite {
  val smallInteger = Gen.choose(-100, 100) // generates numbers between -100 and 100

  property("commutativity of addition of small numbers") {
    forAll(smallInteger) { (a: Int) =>
      forAll(smallInteger) { (b: Int) =>
        assertEquals(a + b, b + a)
      }
    }
  }
}
