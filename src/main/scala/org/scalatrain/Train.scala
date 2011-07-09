package org.scalatrain

/**
 * Created by IntelliJ IDEA.
 * User: fnumrich
 * Date: 01.06.11
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */

case class Train(kind: String, number: String, schedule:Seq[(Time, Station)]) {
  require(kind != null, "kind must not be null!")
  require(number != null, "number must not be null!")
  require(schedule != null, "schedule mus not be null!")
  require(schedule.size >= 2, "schedule must have at least two stops!")

  val stations: Seq[Station] = Nil


}


case class Station(name: String) {
  require(name != null, "Name must not be null")

}
