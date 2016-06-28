package org.validoc.shopping

trait ShoppingCartsFixture {
  val peas = SaleableItem("Peas", 150)
  val pods = SaleableItem("Pods", 250)
  val beans = SaleableItem("Beans", 150)

  val emptyCart = ShoppingTrolley()
  val cartWithOnePeasAndAPod = ShoppingTrolley(peas, pods)
  val cartWithPeas2PodsAndBeans = ShoppingTrolley(peas, pods, pods, beans)
  val cartWith2PeasPodsAndBeans = ShoppingTrolley(peas, peas, pods, beans)
  val cartWith7PeasPodsAndBeans = ShoppingTrolley(List.fill(7)(peas) ++ List(pods, beans))
}
