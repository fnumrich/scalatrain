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

  }


}
