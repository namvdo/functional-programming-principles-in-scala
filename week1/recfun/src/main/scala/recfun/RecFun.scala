package recfun

import scala.annotation.tailrec

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def helper(chars: List[Char], start: Int): Boolean = {
      if (chars.isEmpty) start == 0
      else if (start < 0) false
      else if (chars.head == '(') helper(chars.tail, start + 1)
      else if (chars.head == ')') helper(chars.tail, start - 1)
      else helper(chars.tail, start)
    }
    helper(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def numOfCombinations(money: Int, coins: List[Int]) :Int = {
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else numOfCombinations(money - coins.head, coins) + numOfCombinations(money, coins.tail)
    }
    numOfCombinations(money, coins)
  }

}

