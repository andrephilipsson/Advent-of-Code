val source = scala.io.Source.fromFile("input.txt")
val lines = try source.getLines.toVector finally source.close()

var p1, d1 = 0

lines.foreach { i =>
  val splitted = i.split(' ')
  val amount = splitted.last.toInt
  splitted.head match
    case "forward" =>
      p1 += amount
    case "down" =>
      d1 += amount
    case "up" =>
      d1 -= amount
}

val answer1 = p1 * d1


var p2, d2, a = 0

lines.foreach { i =>
  val splitted = i.split(' ')
  val amount = splitted.last.toInt
  splitted.head match
    case "forward" =>
      p2 += amount
      d2 += amount * a
    case "down" =>
      a += amount
    case "up" =>
      a -= amount
}

val answer2 = p2 * d2
