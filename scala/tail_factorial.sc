def iFact(n: Int): Int = {
  var acc: Int = 1
  for(i <- 1 to n)
    acc *= i
  acc
}

def rFact(n: BigInt): BigInt = {
  if (n == 0) 1
  else n * rFact(n - 1)
}

iFact(3)

val (i1, i3, i5) = (iFact(1), iFact(3), iFact(5))

rFact(3)

var (i1, i3, i5) = (rFact(11), rFact(12), rFact(13))

rFact(450)
rFact(1024)
rFact(4096)
//rFact(8192) //StackOverFlow!!

def tFact(n: BigInt) : BigInt = {
  @scala.annotation.tailrec
  def f(n: BigInt, acc: BigInt): BigInt =
    if(n == 0) acc
    else f(n - 1, n * acc) //스택 프레임 없이 컴파일러가 알아서 최적화
  f(n, acc = 1)
}

tFact(8192)
tFact(32768)

