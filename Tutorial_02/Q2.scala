object Q2 {

  def main(args: Array[String]){

    var a = 2;
    var b = 3;
    var c = 4;
    var d = 5;

    var k = 4.3f;

    //Preincrement, Predecrement, Postincrement and Postdecrement are not support in scala

    //println(--b * a + c * d--);    //28
    b = b+1;
    println(b * a + c * d);
    d = d - 1;

    //println(a++);    //2
    println(a);
    a = a + 1;

    //println(-2 * (g - k) + c);    //value of 'g' is not given in the question
    

    //println(c = c++);    //4
    println(c);
    c = c + 1;

    //println(c = ++c * a++);    //18
    c = c + 1;
    println(c * a);
    a = a + 1;

  }
}
