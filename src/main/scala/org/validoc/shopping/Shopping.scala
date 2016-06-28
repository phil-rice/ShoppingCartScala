package org.validoc.shopping

object ShoppingTrolley {
  def apply(items: SaleableItem*): ShoppingTrolley = ShoppingTrolley(items.toList)
}


case class SaleableItem(name: String, price: Money)

case class ShoppingTrolley(items: List[SaleableItem]) extends Iterable[SaleableItem] {
  override def iterator: Iterator[SaleableItem] = items.iterator
}



