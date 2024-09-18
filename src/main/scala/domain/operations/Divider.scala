package domain.operations

trait Divider {
  def divide(y: Double): Double
}

final case class DividerImpl(x: Double) extends Divider {
  def divide(y: Double): Double = {
    if (y == 0) throw new IllegalArgumentException("Division by zero.")
    x / y
  }
}
