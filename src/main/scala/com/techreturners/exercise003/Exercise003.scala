package com.techreturners.exercise003

class Exercise003 {

  def getIceCreamCode(iceCreamFlavour: String): Int = {

    val iceCreamFlavours = new InMemoryIceCreamOptions
    iceCreamFlavours.getFlavourCode(iceCreamFlavour)
  }

  def iceCreamFlavours: Array[String] = {
    val iceCreamFlavours = new InMemoryIceCreamOptions
    iceCreamFlavours.flavours
  }

}
