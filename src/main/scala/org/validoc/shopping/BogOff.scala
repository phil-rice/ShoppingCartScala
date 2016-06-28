package org.validoc.shopping

trait BogOff {
  protected def itemAggregator: ItemAggregator

  def apply(item: SaleableItem)(shoppingTrolley: ShoppingTrolley) = {
    val aggregates = itemAggregator(shoppingTrolley)
    val numberOfRelevantItems = aggregates.getOrElse(item, 0)
    val bogOffDeals = numberOfRelevantItems / 2
    List.fill(bogOffDeals)(SaleableItem(s"BOGOFF - ${item.name}", 0 - item.price))
  }
}

object BogOff extends BogOff {
  protected val itemAggregator = ItemAggregator
}
