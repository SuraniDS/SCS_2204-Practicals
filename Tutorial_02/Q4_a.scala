object Q4_a {

  def wage(normalHours: Double) : Double = normalHours * 250.00;

  def ot(otHours: Double) : Double = otHours * 85.00;

  def income (normalHours: Int, otHours:Int) : Double = wage (normalHours: Double) + ot (otHours: Double);

  def tax (normalHours: Int, ot:Int) =

    if (normalHours>=40 && ot>=30) {
      income(normalHours, ot) * 12.0/100;
    }
    else
      0.0;

  def takeHomeSalary (normalHours: Int, ot:Int): Double =

    income(normalHours, ot) - tax(normalHours, ot);


  def main (args: Array[String]){

    println("Take Home Salary : " + takeHomeSalary(40, 30));

  }
  
}
