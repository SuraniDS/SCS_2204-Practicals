object Q1 extends App {

  print("Input an Integer : ")
  var num : Int = scala.io.StdIn.readInt()

  def prime(n:Int, i:Int = 2): Boolean = i match {
    case x if(x == n) =>  true
    case x if(n % i == 0) => false
    case _ => prime(n, i+1)
  }

  println(prime(num))

}
