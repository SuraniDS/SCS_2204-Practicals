package Point

case class Point(var x:Int, var y:Int) {

    def add(p: Point) =  new Point(this.x + p.x, this.y + p.y)

    def move(x: Int, y: Int): Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(p: Point): Double ={
        var disX: Int = this.x - p.x
        var disY: Int = this.y - p.y
        var dis: Int = disX * disX + disY * disY
        scala.math.sqrt(dis)
    }

    def invert(): Unit = {
        var temp = this.x
        this.x = this.y
        this.y = temp
    }

}

object Point extends App{

    var m = Point(5,6)
    var n = Point(2,3)

    println(m.add(n))

    m.move(1,1)
    println(m)

    var d = m.distance(n)
    println(d)

    m.invert()
    println(m)
}



