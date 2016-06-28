package org.validoc.shopping

trait PriceCalculator {
  def calculatePayment(trolley: ShoppingTrolley): Money =
    trolley.foldLeft(0)((accumulator, item) => accumulator + item.price)

}

object PriceCalculator extends PriceCalculator {

}
