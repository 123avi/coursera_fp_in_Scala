package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c:Int,r:Int) :Int = {
     if (c == 0) 1
     else if (c == r) 1
     else pascal(c-1,r-1)+pascal(c,r-1)
     }


  /**
   * Exercise 2
   */
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

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0 ) 1
    else if (coins.isEmpty ||  money < 0 ) 0
    else countChange(money,coins.tail) + countChange(money - coins.head,coins)

  }
}
