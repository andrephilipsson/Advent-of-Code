val source = scala.io.Source.fromFile("input.txt")
val lines = try source.getLines.toVector finally source.close()

@main def solve =
  var p, d, a = 0

  lines.foreach { i =>
    val splitted = i.split(' ')
    val amount = splitted.last.toInt
    splitted.head match
      case "forward" =>
        p += amount
        d += amount * a
      case "down" =>
        a += amount
      case "up" =>
        a -= amount
  }

  println(s"Answer: ${p * d}")
