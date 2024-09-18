package domain.operations

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers

class DividerSpec extends AnyFunSpec with Matchers {

  describe("test") {
    it("should dived properly") {
      val test = DividerImpl(10d)
      test.divide(5d) must be(2d)
    }

    it("should handle division by zero") {
      val test = DividerImpl(10d)
      intercept[IllegalArgumentException] {
        test.divide(0d)
      }
    }
  }
}

