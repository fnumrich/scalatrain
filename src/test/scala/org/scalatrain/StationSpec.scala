package org.scalatrain

import org.specs.Specification

/**
 * Created by IntelliJ IDEA.
 * User: fnumrich
 * Date: 09.07.11
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */

class StationSpec extends Specification {
  "Creating a station" should {
    "throw an IllegalStateException fol all null names" in {
      Station(null) must throwA[IllegalStateException]
    }
  }
}