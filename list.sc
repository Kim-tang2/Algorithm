val numbers = List(1, 2, 3, 4, 5)

// 함수형 프로그래밍에선 컬렉션이 있을 때 s를 뒤에 붙이는 게 관례 특별한 이유가 없으면..
def doubleList(xs: List[Int]): List[Int] = // 리커전
  if (xs.isEmpty) Nil
  else (xs.head * 2) :: doubleList(xs.tail)

def doubleListPM(xs: List[Int]): List[Int] = xs match { // 원소 패턴매칭
  case Nil => Nil
  case x :: tail => (x * 2) :: doubleListPM(tail)
}

def timesList(n: Int)(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else (n * xs.head) :: timesList(n)(xs.tail)

def squareList(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else (xs.head * xs.head) :: squareList(xs.tail)

//고차함수로 제곱 처리하기
def mapIntList(f: Int => Int)(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else f(xs.head) :: mapIntList(f)(xs.tail)

def mapList[T, U](f: T => U)(xs: List[T]): List[U] =
  if (xs.isEmpty) Nil
  else f(xs.head) :: mapList(f)(xs.tail)

def double(n: Int): Int = n * 2
def square(n: Int): Int = n * n

def upper(c: Char): Char = c.toUpper

doubleList(numbers)
doubleListPM(numbers)

timesList(2)(numbers)
timesList(3)(numbers)

squareList(numbers) // 제곱

mapIntList(double)(numbers)
mapIntList(square)(numbers)

mapList(double)(numbers)
mapList(upper)(List('a', 'b', 'c'))
mapList((n: Int) => n * n)(numbers) // 바로 익명함수 넣어도 가능
mapList((n: Int) => Math.sqrt(n))(numbers)

//Scala List API
numbers.map(n => n * 2)
numbers.map(n => Math.sqrt(n))

numbers.filter(n => n % 2 == 0)
numbers.max
numbers.exists(n => n % 7 == 0)

numbers.reduce((a, b) => a + b) // sum과 똑같음
numbers.sum

numbers.reduce((a, b) => a * b) // product와 똑같음
numbers.product

numbers.partition(n => n % 2 == 0) // 참 값과 거짓 값을 각자 다른 컬렉션으로 나눔
numbers.mkString(",")

numbers.zip(List("A", "B", "C", "D", "E"))
List("A", "B", "C").zipWithIndex

var nested = List(List(1, 3), List(2, 4))
nested.flatten // 원소 합치기

numbers.map(x => List(x, x * x))
numbers.flatMap(x => List(x, x * x))