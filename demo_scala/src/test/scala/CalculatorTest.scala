import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

  @Test
  def  shouldAddTwoPositiveNumbers = {
    val calculator = new Calculator()
    val result = calculator.add(2,4)
    assertEquals(6, result)
  }
}
