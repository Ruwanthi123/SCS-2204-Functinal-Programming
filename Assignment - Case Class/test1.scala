

import scala.math._
object test1 {

  case class point(x:Int, y:Int){
    def +(p:point)=point(p.x+this.x, p.y+this.y)
    def move(dx:Int, dy:Int)=point(dx+this.x, dy+this.y)
          def distance(p:point):Double=(sqrt(scala.math.pow(this.x-p.x,2)+scala.math.pow( this.y-p.y,2)))
    def invert=point(this.y, this.x)
  }

  def main(args: Array[String]): Unit = {
    val p1 = point(2,3)
    val p2 = point(5,4)
    val p3 = p1+p2

    println(" p1 = "+p1)
    println(" p2 = "+p2)
    println(" p1 + p2 = "+p3)
    println(" p1 move (2,3) New point = "+p1.move(2,5))
          println(" distance between p1 and p2 = "+ p1.distance(p2))
    println(" invert p1 cordinates = "+ p1.invert)
  }

}