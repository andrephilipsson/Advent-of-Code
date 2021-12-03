val source = scala.io.Source.fromFile("input.txt")
val lines = try source.getLines.toVector finally source.close()

@main def solve =
  var p, d = 0

  lines.foreach { i =>
    val splitted = i.split(' ')
    val amount = splitted.last.toInt
    splitted.head match
      case "forward" =>
        p += amount
      case "down" =>
        d += amount
      case "up" =>
        d -= amount
  }

  println(s"Answer: ${p * d}")
