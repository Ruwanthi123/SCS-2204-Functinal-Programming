import java.util.Scanner;
import scala.io.StdIn.readInt;

object question_06{

	def fibonacci(number: Int): Int = {
		if (number == 0) {
			return 0
		}
		else if (number == 1 || number == 2) {
			return 1
		}
		else {
			return fibonacci(number - 2) + fibonacci(number - 1)
		}

	}
	def main(args:Array[String]){

		var input = new Scanner (System.in);
		print("Get addition of numbers from 1 to n\n");
		print("Enter a number :");
		val num=input.nextInt();

		for (a <- 0 until num) {
			print(fibonacci(a) + " ");
		}
	}



}