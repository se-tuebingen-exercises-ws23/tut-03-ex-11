object SumIntegers {
  /* Returns the sum of the two integers on input.
   *
   * @precondition a is between 1 and 99
   * @precondition b is between 1 and 99
   */
  def sumIntegers(a: Int, b: Int): Int = {
    if (a < 1 || a > 99 || b < 1 || b > 99) {
      throw IllegalArgumentException()
    }

    a + b
  }
}
