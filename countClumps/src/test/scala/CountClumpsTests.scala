import countClumps.*

class CountClumpsTests extends munit.FunSuite {
  test("two plus two is four") { // This is how a test is declared
    assertEquals(2 + 2, 4)
  }

  // In order to call the `countClumps` function, you need to call it in a qualified way:
  // i.e. `Clumps.countClumps(...)`.
}
