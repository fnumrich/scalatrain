package org.scalatrain

/**
 * Created by IntelliJ IDEA.
 * User: fnumrich
 * Date: 01.06.11
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */

case class Train(kind: String, number: String) {
  require(kind != null, "kind must not be null!")
  require(number != null, "number must not be null!")
  // test
}