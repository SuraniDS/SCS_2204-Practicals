object Q2 extends App {

  print("Input an Integer : ")
  var num : Int = scala.io.StdIn.readInt()

  def PatternMatchiing(num: Int): String = num match {
    case num if num <= 0 => "Negative / Zero"
    case num if num % 2 == 0 => "Even Number"
    case _ => "Odd Number"
  }

  println(PatternMatchiing(num))

}
