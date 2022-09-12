object Q2 extends App{

  val r1 = new Rational(3,4)
  val r2 = new Rational(5,8)
  val r3 = new Rational(2,7)

  val result = r1.sub(r2.sub(r3))
  println(result)

}
