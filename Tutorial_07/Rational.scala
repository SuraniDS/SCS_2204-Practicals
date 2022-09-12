class Rational(x: Int, y: Int) {

  def numer = x
  def denom = y

  def add(r: Rational) = new Rational(this.x * r.denom + this.y * r.numer , this.y * r.denom)
  def sub(r:Rational) = new Rational(this.numer * r.denom + this.denom * r.numer , this.denom * r.denom)
  def neg = new Rational(-this.numer, this.denom)

  override def toString: String = numer + "/" + denom

}