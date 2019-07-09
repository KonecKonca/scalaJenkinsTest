package com.kozitski.mock

import org.scalatest.FunSuite

class AppRunnerTest extends FunSuite{
  val actualrecord = "--333--"

  test("AppRunner test"){

    val expectedRecord = AppRunner.printArgsToFile("11", "333")

    assertResult(expectedRecord)(actualrecord)
  }

}
