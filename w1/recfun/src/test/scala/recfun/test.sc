import scala.annotation.tailrec

def balance(chars: List[Char]): Boolean = {
  def run(openings:Int, c:List[Char] ):Boolean = {
    if (c.isEmpty || openings < 0)openings == 0
    else if (c.head == ('('))
      run(openings+1,c.tail)
    else if (c.head == (')'))
      run(openings-1,c.tail)
    else
      run(openings,c.tail)
  }
  run(0,chars)
}
val test1 ="(if (zero? x) max (/ 1 x))".toList
val test2 = "())(".toList
val test3 = ":-)".toList
val test4 = "I told him (that it’s not (yet) done). (But he wasn’t listening)".toList
balance(test1)
balance(test2)
balance(test3)
balance(test4)
//(2,3) , 5

def countChange(money: Int, coins: List[Int]): Int = {
  if (money == 0 ) 1
  else if (coins.isEmpty ||  money < 0 ) 0
  else countChange(money,coins.tail)  + countChange(money - coins.head,coins)
}
countChange(4,List(1,2))
countChange(300,List(5,10,20,50,100,200,500))
def factorial (n:Int):Int ={
  def run(sum:Int,x:Int):Int ={
    if (x==0) sum else run(sum * x, x-1)
  }
  run(1,n)
}
val f =factorial(4)

def sum(x:Int,y:Int):Double = x/y

4 +% 6
