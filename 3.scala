
import scala.io.StdIn
  
  object Question{
      
    def sum(n: Int): Int = {
         if (n <= 0)
            0
        else
             n + sum(n - 1)
    }

    def main(args:Array[String]): Unit={  
     
        println("Enter a number")
        val n = StdIn.readInt()
        
        println(sum(n));
       
     
    }  
 
  }
