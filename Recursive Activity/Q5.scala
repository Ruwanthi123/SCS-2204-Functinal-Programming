import java.util.Scanner;
import scala.io.StdIn.readInt;

object question_05{


	def addNumber(m:Int,n:Int=0): Int=m match{
		case 0 =>n
		case x if x%2==0 => addNumber((m-1),(n+m))
		case x if x%2==1 => addNumber((m-1),(n))
	}


	def main(args:Array[String]){

		var input = new Scanner (System.in);
		print("Get addition of numbers from 1 to n\n");
		print("Enter a number :");
		val num=input.nextInt();

		println(addNumber(num));
	}
}

