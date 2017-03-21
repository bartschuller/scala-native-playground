import scala.annotation.tailrec

object Demo {
  val fib: Stream[BigInt] = 0 #:: 1 #:: fib.zip(fib.tail).map(p => p._1 + p._2)

  def tailRecursiveBig(n :Int) : BigInt = {
    @tailrec
    def aux(n : Int, next :BigInt, acc :BigInt) :BigInt ={
      if(n == 0) acc
      else aux(n-1, acc + next,next)
    }
    aux(n,1,0)
  }

  def demo(): Unit = {
    // println(tailRecursiveBig(100000))
    //println("large fib: " + fib.take(100000).takeRight(2).mkString(" "))
  }
}
