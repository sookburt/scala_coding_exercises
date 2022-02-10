package com.techreturners.exercise003

class Exercise003 {

  def getIceCreamCode(iceCreamFlavour: String): Int = {

    val flavours = Array("Pistachio",
      "Raspberry Ripple",
      "Vanilla",
      "Mint Chocolate Chip",
      "Chocolate",
      "Mango Sorbet"
    )
    flavours.indexOf(iceCreamFlavour)
  }

  def iceCreamFlavours: Array[String] = {
    throw new UnsupportedOperationException("You can delete this line and add your code here.")
  }

}
