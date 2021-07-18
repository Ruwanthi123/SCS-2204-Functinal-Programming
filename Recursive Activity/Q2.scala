import java.util.Scanner;
import scala.io.StdIn.readInt;

object question_02{


	def GCD(m:Int,n:Int): Int=n match{
        	case 0 => m
		case x if x>m => GCD(x,m)
		case _ => GCD(n,m%n)
   	}

	def prime(p:Int, q:Int=2): Boolean = q match{
		case x if(x==p) => true
		case x if GCD(p,x) > 1 => false
		case x => prime(p,x+1)
	}

	def primeSeq(a:Int): Unit={
		if(a>2) 
			primeSeq(a-1);
		var bool= (prime(a)); 
		if (bool)
			println(a);
	}

	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Print all prime number which less than given number\n");
		print("Enter number :");
		val num=input.nextInt();

		primeSeq(num);
	}
}

