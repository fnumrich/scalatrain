package org.scalatrain

import org.specs.Specification

class TrainSpec extends Specification {

  "Creating a Train" should {
    "throw an IllegalArgumentException for a null kind" in {
      new Train(null, "number") must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for a null number" in {
      new Train("kind2", null) must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for a null schedule" in {
      new Train("kind2", "number", null) must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for a schedule with less than two stops" in {
      new Train("kind2", "number", Seq(Time(12,10) -> Station("Name"))) must throwA[IllegalArgumentException]
    }

    "Getting stations" should {

      "return the correct stations in correct sequence" in {
        val train = Train("kind", "number", List(Time(0,0) -> Station("0"), Time(1,1) -> Station("1")))
        train.stations mustEqual List(Station("0"), Station("1"))
      }
    }

  }


}
