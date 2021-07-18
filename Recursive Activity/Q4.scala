import java.util.Scanner;
import scala.io.StdIn.readInt;

object question_04{

	def isEven(m:Int): Boolean=m match{
        	case 0 => true
		case _ => isOdd(m-1)
   	}
	
	def isOdd(m:Int): Boolean={
     		! (isEven(m)) 
   	}


	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Determine given number is odd or even\n");
		print("Enter number :");
		val num=input.nextInt();

		if(isOdd(num))
			println("Odd");
		else
			println("Even");
	}
}


object isEven extends App {
  
    val a = scala.io.StdIn.readInt()
    if(isEven(a)){println("Even")}else {println("not even")}
    if(isOdd(a)){println("Odd")}else {println("not odd")}
    
  
  def isEven(n:Int):Boolean = n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  
  def isOdd(n:Int) : Boolean = !(isEven(n))
}