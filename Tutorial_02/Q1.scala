object Q1 {

  def main(args: Array[String]){

    var k = 2;
    var i = 2;
    var j = 2;
    var m = 5;
    var n = 5;
    var f = 12.0f;
    var g = 4.0f;
    var c = 'X';

    println(k + 12 * m);      //62
    println(m / j);           //2
    println(n % j);           //1
    println(f + 10 * 5 + g);  //66.0

    //println(++i * n);  -> Preincrement is not support in scala

  }
}
