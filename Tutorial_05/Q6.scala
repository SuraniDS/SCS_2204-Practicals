object Q6 extends App {

  print("Input a NUmber : ")
  var n : Int = scala.io.StdIn.readInt()

  def fib(n : Int):Int = n match{
    case 0 => 0
    case 1 => 1
    case x => fib(x-1) + fib(x-2)
  }

  def fibSeq(m:Int){
    if(m>0) fibSeq(m-1)
    println(fib(m))
  }

  fibSeq(n);
}
