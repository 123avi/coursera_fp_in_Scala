class Rational(n:Int,d:Int){
  def numer = n
  def denom = d
  override def toString = n/math.abs(gcd(n,d)) +"/"+d/math.abs(gcd(n,d))
  def + (that:Rational ) =new Rational ((numer*that.denom + that.numer*denom),(denom * that.denom))
  def neg = new Rational(-numer,denom)
  def sub (that:Rational) = this + that.neg
  def - (that:Rational) = this + that.neg
}

def gcd(a:Int,b:Int):Int = {
  if (b == 0) a
  else gcd(b, a % b)
}


val x  = new Rational(5,7) - new Rational(3,2)
new Rational(3,4) -  new Rational(1,4) - new Rational(1,4)
new Rational(1,2).neg

