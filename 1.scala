import scala.io.StdIn
  
  object Question{
      
      def prime(n: Int): Boolean = {
        def isPrime(n: Int, i: Int): Boolean = {
            if (n == 2)
            return true
            if (n <= 1 || n % i == 0)
            return false
            if (i * i > n)
            return true
            isPrime(n, i + 1)
  }

    isPrime(n, 2)
}

        def main(args:Array[String]): Unit={  
     

        println("Enter a number")
        val n = StdIn.readInt()
        
        println(prime(n));
       
     
    }  
 
  }