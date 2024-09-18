package entrypoint

import domain.operations.DividerImpl

object Main {
  def main(args: Array[String]): Unit = {
    println(DividerImpl(100).divide(10))
  }
}
