object Q4 extends App {

  print("Input an Integer : ")
  var num : Int = scala.io.StdIn.readInt()

  def isEvenOrOdd(n:Int): Unit = n match{
    case 0 => println("Even Number")
    case 1 => println("Odd Number")
    case _ => isEvenOrOdd(n-2)
  }

  isEvenOrOdd(num)

}
