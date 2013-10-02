package dojo

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import dojo.Wrapper._

@RunWith(classOf[JUnitRunner])
class WrapperSuite extends FunSuite {

  test("string shorter than col num") {
    assert("foo" === wrap("foo", 5))
  }

  test("text where each line is shorter than col num") {
    assert("a b c d.\ne a fe" === wrap("a b c d.\ne a fe", 10))
  }

  //TODO write another test with a trailing new line
  //TODO write another test with two new lines next to each other
//  test("one line text swith line longer than column number"){
//    assert("12345\n1234" === wrap("12345 1234",7))
//  }

  test("one word text longer than column width") {
    assert("1234\n5"=== wrap("12345",4))
  }

  test("split line into words"){
    assert(splitIntoWords("a bad character defines") === Seq("a", "bad", "character", "defines"))
  }

}
