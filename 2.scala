import scala.io.StdIn

object Question {
  def isPrime(n: Int, i: Int = 2): Boolean = {
    if (n < 2) return false
    if (i * i > n) return true
    if (n % i == 0) return false
    isPrime(n, i + 1)
  }

  def primeseq(n: Int): Unit = {
    if (n > 1) {
      primeseq(n - 1)
      if (isPrime(n)) print(n + "\t")
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val n = StdIn.readInt()
    primeseq(n)
    println()
  }
}

