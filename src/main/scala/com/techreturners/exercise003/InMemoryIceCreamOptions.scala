package com.techreturners.exercise003

class InMemoryIceCreamOptions {

  private val _flavours = Array("Pistachio",
    "Raspberry Ripple",
    "Vanilla",
    "Mint Chocolate Chip",
    "Chocolate",
    "Mango Sorbet"
  )

  def flavours: Array[String] = _flavours

  def getFlavourCode(flavourName: String): Int = {
    _flavours.indexOf(flavourName)
  }

}
