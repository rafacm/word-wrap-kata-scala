package dojo

object Wrapper {

  def wrap(text: String, col: Int): String = {
    text.split("\n").map(l => wrapLine(l, col)).mkString("\n")
  }

  def wrapLine(text: String, col: Int): String = {
    if(text.size>col)
      {
        val first: String = text.take(col)
        if (first.endsWith(" "))
          first.substring(0, first.size - 2) + "\n" + text.drop(col)
        else
          first + "\n" + text.drop(col)
      }
    else
      text
  }

  def splitIntoWords(line : String): Seq[String] = {
    line.split(" ")
  }

}