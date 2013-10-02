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
    assert("""a b c d.\n\ne a fe\n""" === wrap("""a b c d.\n\ne a fe\n""", 10))
  }
//  test("one line text with line longer than column number"){
//    assert("""12345\n1234""" === wrap("""12345 1234""",7))
//  }
}
