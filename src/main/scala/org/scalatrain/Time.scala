package org.scalatrain

/**
 * Created by IntelliJ IDEA.
 * User: fnumrich
 * Date: 01.06.11
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 */

case class Time(hours: Int = 0, minutes: Int = 0) {

  lazy val asMinutes = minutes + hours * 60

  def minus(that: Time): Int = {
    this.asMinutes - that.asMinutes
  }

  def -(that:Time): Int =
    minus(that)

}

object Time {

  def fromMinutes(minutes: Int): Time = {
    new Time(minutes / 60, minutes % 60)
  }
}
