package fpcoding.e09

object Permutations extends App {

  def permutations[T](xs: List[T]): List[List[T]] =
    if (xs.isEmpty) List(Nil)
    else xs.zipWithIndex.flatMap { case (x, i) =>
      permutations(removeAt(xs, i)).map(x :: _)
    }

  def removeAt[T](xs: List[T], i: Int): List[T] =
    xs.take(i) ++ xs.drop(i + 1)

  private def pperm[T](xs: List[T]): Unit =
    println(s"순열($xs) == " + permutations(xs))

  pperm(List())
  pperm(List(1))
  pperm(List(1, 2, 3))
}