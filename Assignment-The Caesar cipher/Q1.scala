import scala.io.StdIn._

object caesarCipher{

  def encrytion(c:Char,key:Int,s:String):Char={
    if(c>= 'a' && c <= 'z'){                    //lowercase
      s((s.indexOf(c.toLower)+key)%s.size)
    }else{                                      //uppercase
      s((s.indexOf(c.toUpper)+key)%s.size)
    }
  }

  def decrytion(c:Char,key:Int,s:String):Char={
    if(c>= 'a' && c <= 'z'){                    //check for lowercase letters
      s((s.indexOf(c.toLower)-key)%s.size)
    }else{                                      //check for uppercase letters
      s((s.indexOf(c.toUpper)-key)%s.size)
    }
  }

  def cipher(algo:(Char,Int,String)=>Char,t:String,key:Int,a:String):String={

    t.map(algo(_,key,a))
  }

  def main(args: Array[String]){

    val alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ#$%^&"

    print("Enter the text : ")
    val text = readLine()
//plan text can only contain letters

    val E = cipher(encrytion,text,5,alphabet)  //encrypt given string

    val D = cipher(decrytion,E,5,alphabet)    //decrypt given string

    println("Encrypted text = "+E)
    println("Decrypted text = "+D)
  }

}