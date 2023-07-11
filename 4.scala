

import scala.io.StdIn
  
  object Question{
   
    def isEven(n: Int): Boolean = {
        if (n == 0)
            true
        else if (n == 1)
            false
        
        else
            isEven(n - 2)
    }

    def main(args:Array[String]): Unit={  
     
        println("Enter a number")
        val n = StdIn.readInt()
        
        println(if(sum(n))"even" else"odd");
       
     
    }  
 
  }
