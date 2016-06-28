package org.validoc.shopping

import org.scalatest.{FlatSpec, Matchers}


class ItemAggregatorSpec extends FlatSpec with Matchers with ShoppingCartsFixture {

  "An item aggregator" should "take a trolley and produce an aggregated trolley which has 'items and how many times they occur' in it" in {
    ItemAggregator(emptyCart) shouldBe Map()
    ItemAggregator(cartWithOnePeasAndAPod) shouldBe Map(peas -> 1, pods -> 1)
    ItemAggregator(cartWithPeas2PodsAndBeans) shouldBe Map(peas -> 1, pods -> 2, beans -> 1)
    ItemAggregator(cartWith2PeasPodsAndBeans) shouldBe Map(peas -> 2, pods -> 1, beans -> 1)
  }
}
