package org.validoc.shopping

import org.scalatest.{FlatSpec, Matchers}

class ShoppingSpec extends FlatSpec with Matchers with ShoppingCartsFixture {

  "A shopping trolley price calculator" should "add up the values of the items in a cart" in {
    PriceCalculator.calculatePayment(emptyCart) shouldBe 0
    PriceCalculator.calculatePayment(cartWithOnePeasAndAPod) shouldBe 400
  }
}






