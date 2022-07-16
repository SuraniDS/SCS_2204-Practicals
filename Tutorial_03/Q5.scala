object Q5 {

  def easyPace(distance1 : Double): Double = distance1 * 8;

  def tempo(distance2 : Double): Double = distance2 * 7;

  def totalRuningTime(dis1: Double, dis2: Double): Double = {
    easyPace(dis1) + tempo(dis2);
  }

  def main(args: Array[String]){
    println("Total Runing Time : " + totalRuningTime(4, 3) + " mins");
  }

}
