val source = scala.io.Source.fromFile("input.txt")
val lines = try source.getLines.toVector finally source.close()

@main def solve =
  val answer = lines.map(_.toInt).sliding(3).map(_.sum).sliding(2).count(v => v(0) < v(1))
  println(s"Answer: $answer")
