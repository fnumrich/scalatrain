package org.scalatrain

import org.scalacheck.Gen._
import org.scalacheck.Prop._
import org.specs.{ScalaCheck, Specification}
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result

class TimeSpec extends Specification with ScalaCheck {
  "Calling fromMinutes" should {

    "throw an IllegalArgumentException for negative minutes" in {
      forAll(choose(Int.MinValue, -1))  { (minutes: Int) =>
        Time fromMinutes minutes must throwA[IllegalArgumentException]
      } must pass
    }

    "throw an IllegalArgumentException for minutes >= 24 * 60 " in {
      forAll(choose(24 * 60, Int.MaxValue))  { (minutes: Int) =>
        Time fromMinutes minutes must throwA[IllegalArgumentException]
      } must pass
    }

    "return a correctly initialized Time instance for minutes within [0, 24 * 60 - 1)" in  {
      forAll(choose(0,24 * 60 -1)) { (minutes: Int) =>
        val result = Time fromMinutes minutes
        result.hours mustEqual minutes / 60
        result.minutes mustEqual minutes % 60
      } must pass
    }
  }

  "Calling - " should  {

    "throw an IllegalArgumentException for this smaller than that" in {
      val one = Time(10, 23)
      val two = Time(12, 44)
      val three = one - two must throwA[IllegalArgumentException]
    }

    "return the difference for this greater than that" in {
      val one = Time(10, 23)
      val two = Time(12, 44)
       val three = two - one
       three mustEqual 141
     }

    "return the difference of zero for this equal to that" in {
      val one = Time(10, 23)
      val two = Time(10, 23)
       val three = two - one
       three mustEqual 0
     }
    }
}