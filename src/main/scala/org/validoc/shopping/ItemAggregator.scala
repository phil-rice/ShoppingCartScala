package org.validoc.shopping


trait ItemAggregator {
  def apply(shoppingTrolley: ShoppingTrolley) = shoppingTrolley.groupBy(x => x).map { case (k, v) => (k, v.size) }
}

object ItemAggregator extends ItemAggregator