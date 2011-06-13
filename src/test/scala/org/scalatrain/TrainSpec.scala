package org.scalatrain

import org.specs.Specification

class TrainSpec extends Specification {

  "Creating a Train" should {
    "throw an IllegalArgumentException for a null kind" in {
      new Train("kind", null) must throwA[IllegalArgumentException]
    }

  }


}
