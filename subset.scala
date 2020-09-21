package fpcoding.e08

object AllSubsets extends App{
  def subsets[T](xs: List[T]) : List[List[T]] =
    if(xs.isEmpty) List(Nil)
    else subsets(xs.tail)
      .flatMap(ys => List(ys, xs.head :: ys))

  //  val ys = subsets(xs.tail)
  //  ys ++ ys.map { y => xs.head :: y }

  psubsets(List())
  psubsets(List(1))
  psubsets(List(1, 2))
  psubsets(List("a", "b", "c"))

  private def psubsets[T](xs: List[T]) {
    println(s"subsets($xs) =="
      + subsets(xs).mkString("List(\n ", "\n ", "\n)"))
  }
}

object ScalaSubSets extends App{
  psubsets(List())
  psubsets(List(1))
  psubsets(List(1, 2))

  private def psubsets[T](xs: List[T]): Unit ={
    println(s"subsets($xs) == "
      + xs.toSet.subsets().mkString("List(\n ", "\n ", "\n)"))
  }
}