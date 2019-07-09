package com.kozitski.mock

object AppRunner extends App {

  println("::: " + args(0) + "   " + args(1))
  printArgsToFile(args(0), args(1))

  def printArgsToFile(path: String, text: String): String= {
    import java.io._

    val pw = new PrintWriter(new File(path + ".txt" ))
    val toWriteMessage = "--" + text +"--"
    pw.write(toWriteMessage)

    pw.close()

    toWriteMessage
  }

}
