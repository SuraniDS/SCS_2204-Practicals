object Q3 {

  def volumeOfSphere(r: Int): Double = {
    4.0/3.0 * math.Pi * r * r * r;
  }

  def main(arg: Array[String]){
    println("Volume of the Sphere : " + volumeOfSphere(5));
  }
  
}
