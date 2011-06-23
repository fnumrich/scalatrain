package org.scalatrain

/**
 * Created by IntelliJ IDEA.
 * User: fnumrich
 * Date: 02.06.11
 * Time: 00:42
 * To change this template use File | Settings | File Templates.
 */

case class Person(firstName: String, lastName: String) {
  require(firstName != null, "Firstame should noht be null")
  require(lastName != null, "Lastname should not be null")
  require(firstName.trim().length() != 0, "Firstame should not be empty")
  require(lastName.trim().length() != 0, "Lastname should not be empty")

}