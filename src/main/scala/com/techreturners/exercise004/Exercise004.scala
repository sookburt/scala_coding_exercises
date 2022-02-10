package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def this(dateTime: LocalDate ) = {
    this(LocalDateTime.of(dateTime.getYear, dateTime.getMonth, dateTime.getDayOfMonth, 0,0,0))
  }

  def getDateTimeWithGigaSecond: LocalDateTime = dateTime.plusSeconds(1000000000)
}
