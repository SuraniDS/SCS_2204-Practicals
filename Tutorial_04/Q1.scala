object Q1 extends App {

  print("Enter the deposit Amount : ")
  var depositAmount : Int = scala.io.StdIn.readInt()

  def interest(deposit:Double):Double = deposit match {
    case deposit if deposit <= 20000 => deposit * 0.02
    case deposit if deposit <= 200000 => deposit * 0.04
    case deposit if deposit <= 2000000 => deposit * 0.035
    case _ => deposit * 0.065
  }

  println("Interest per Year : " + interest(depositAmount))

}
