package org.validoc.shopping

import org.scalatest.{FlatSpec, Matchers}

class BogOffSpec extends FlatSpec with Matchers with ShoppingCartsFixture {

  val peasBogOffFinder = BogOff(peas) _

  "A BogOffFinder" should "find a BogOff deal for things it is looking for" in {
    peasBogOffFinder(emptyCart) shouldBe List()
    peasBogOffFinder(cartWithOnePeasAndAPod) shouldBe List()
    peasBogOffFinder(cartWithPeas2PodsAndBeans) shouldBe List()
    peasBogOffFinder(cartWith2PeasPodsAndBeans) shouldBe List(SaleableItem("BOGOFF - Peas", -150))
    peasBogOffFinder(cartWith7PeasPodsAndBeans) shouldBe List.fill(3)(SaleableItem("BOGOFF - Peas", -150))
  }

}