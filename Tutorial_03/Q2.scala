object Q2 {

  def convertTemp(tCelcius: Int): Double = {
    tCelcius * 1.8000 + 32.00;
  }

  def main(args: Array[String]){
    println("Fahremheit Tempreture = " + convertTemp(35));
  }

}
