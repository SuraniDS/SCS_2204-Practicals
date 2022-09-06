object Q2 extends App {

  print("Input a Number : ")
  var num : Int = scala.io.StdIn.readInt()

  def prime(n:Int, i:Int = 2): Any = i match {
    case x if(x == n) =>  println(x)
    case x if(n % x == 0) => false
    case x => prime(n, x+1)
  }

  def primeSeq(m:Int, j:Int = 2){
    if(j<m) prime(j)
    primeSeq(m,j+1)
  }

  primeSeq(num)

}
