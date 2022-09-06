object Q3 extends App {

  print("Input a Number : ")
  var n : Int = scala.io.StdIn.readInt()

  def sum(m:Int, v:Int = 0): Int = {
    if(m>0) sum(m-1, v+m)
    else return v
  }

  println(sum(n))

}
