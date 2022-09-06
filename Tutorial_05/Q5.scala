object Q5 extends App {

  print("Input a Number : ")
  var num: Int = scala.io.StdIn.readInt()

  def evenSum(n:Int): Int = n match{
    case x if(x<1) => return n
    case x if(x % 2 == 0) => return x + evenSum(x-2)
    case x if(x % 2 == 1) => return (x-1) + evenSum(x-3)
  }

  println(evenSum(num))

}
