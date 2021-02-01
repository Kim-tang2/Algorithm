def iFact(n: Int): Int = {
  var acc: Int = 1
  for(i <- 1 to n)
    acc *= i
  acc
}

def rFact(n: Int): Int = {
  if (n == 0) 1
  else n * rFact(n - 1)
}

iFact(3)

val (i1, i3, i5) = (iFact(1), iFact(3), iFact(5))

rFact(3)

var (i1, i3, i5) = (rFact(1), rFact(3), rFact(5))