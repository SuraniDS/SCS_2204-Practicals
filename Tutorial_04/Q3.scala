object Q3 extends App {

  def toUpper(str: String): String = { str.toUpperCase() }

  def toLower(str: String): String = { str.toLowerCase() }

  def formatNames(name: String)(tempArr: Int*)(format: String => String): String = {

    if(tempArr.isEmpty){ return format(name) }

    var text = ""
    var i = 0
    while(i < name.length()){
      if(tempArr.contains(i)){ text = text + format(name.charAt(i).toString) }
      else { text = text + name.charAt(i).toString }
      i = i + 1
    }
    text
  }

  println(formatNames("Benny")()(toUpper))
  println(formatNames("Niroshan")(0,1)(toUpper))
  println(formatNames("Saman")()(toLower))
  println(formatNames("Kumara")(5)(toUpper))


}
