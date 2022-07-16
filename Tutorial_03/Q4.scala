object Q4 {

  def totalAmount(bookCount: Int): Double = {
    bookCount * 24.95;
  }

  def discount(price: Double): Double = price * 0.4;

  def shippingCost(bookCount : Int): Double = {
    if(bookCount <= 50) bookCount * 3;
    else bookCount * 3 + (bookCount-50) * 0.75;
  }

  def totWholeSalePrice(bookCount: Int): Double = {
    totalAmount(bookCount) - discount(totalAmount(bookCount)) + shippingCost(bookCount);
  }

  def main(args: Array[String]){
    println("Total Whole Sale Cost : " + totWholeSalePrice(60));
  }

}
