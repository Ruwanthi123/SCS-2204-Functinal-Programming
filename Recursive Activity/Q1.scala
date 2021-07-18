import scala.io.StdIn._
object Q1
{
  def main(args : Array[String]){
    print("Determine given number is prime or Not\n");
    print("Enter number :");
    val a = scala.io.StdIn.readInt()
    print(" Is given number a prime?\n");
    if(prime(a)){println("true")}
    else{println("false")}

  }

  def gcd(x:Int ,y:Int):Int = y match{
    case 0 => x
    case y if (y>x) => gcd(y,x)
    case _ => gcd(y,x%y)

  }

  def prime(p:Int ,q:Int=2):Boolean = q match{
    case x if(p==x) => true
    case x if(gcd(p,x)>1) => false
    case x => prime(p,x+1)
  }
}
