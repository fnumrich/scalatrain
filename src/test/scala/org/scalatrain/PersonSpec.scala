package org.scalaPerson

import org.specs.Specification
import org.scalatrain.Person

/**
 * Created by IntelliJ IDEA.
 * User: fnumrich
 * Date: 23.06.11
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */

class PersonSpec extends Specification {

  "Creating a Person" should {
    "throw an IllegalArgumentException for a null firstname" in {
      new Person(null, "lastname") must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for a null lastname" in {
      new Person("firstname", null) must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for an empty firstname" in {
      new Person("", "lastname") must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for an empty firstname" in {
      new Person("firstname", "") must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for an firstname containing only spaces" in {
      new Person(" ", "lastname") must throwA[IllegalArgumentException]
    }

    "throw an IllegalArgumentException for an firstname containing only spaces" in {
      new Person("firstname", " ") must throwA[IllegalArgumentException]
    }

  }

}