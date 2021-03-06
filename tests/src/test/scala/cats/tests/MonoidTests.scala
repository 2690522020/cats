package cats
package tests



class MonoidTests extends CatsSuite {
  {
    Invariant[Monoid]
    Semigroupal[Monoid]
  }

  test("companion object syntax") {
    Monoid.empty[Int] should ===(0)
    Monoid.isEmpty(1) should ===(false)
    Monoid.isEmpty(0) should ===(true)
  }
}

object MonoidTests {
  def summonInstance(): Unit = {
    Invariant[Monoid]
    Semigroupal[Monoid]
    ()
  }

}
