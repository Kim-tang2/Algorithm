package fpcoding

object Repetitions extends App {
  def compress(cs: List[String]): String = {
    if (cs.isEmpty) ""
    else {
      val reps = cs.takeWhile(cs.head == _).size
      (if (reps == 1) "" else reps.toString) + cs.head +
        compress(cs.drop(reps))
    }
  }

  def compress(s: String): String =
    (1 to Math.max(1, s.length / 2))
      .map { n => compress(s.grouped(n).toList) }
      .minBy(_.length)

  private def solution(s: String): Unit = {
    val compressed = compress(s)
    println(s"compress(${s}) = ${compressed.length}, $compressed")
  }

  solution("aabbaccc")
  solution("ababcdcdababcdcd")
  solution("abcabcdede")
  solution("abcabcabcabcdededededede")
  solution("xababcdcdababcdcd")
}