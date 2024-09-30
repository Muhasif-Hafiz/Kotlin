fun main(){
 var circle :Shape=Circle(4.0)
    var sqaure :Shape=Square(5.0)
    var triangle :Shape=Triangel(5.0,7.5)
    var calArea= arrayOf(Circle(4.0),Triangel(5.75,6.0))
    var shapes=arrayOf(Circle(4.0),Triangel(5.5,7.5),Square(6.0))
    calculateArea(shapes)
}
fun calculateArea(shapes :Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}
open class Shape{
    open fun area() :Double{
        return 0.0
    }

}
class Circle(val rad:Double) :Shape(){
    override fun area() :Double{
        return Math.PI *rad*rad
    }
}
class Square(val side:Double) :Shape(){
    override fun area():Double{
        return side*side
    }
}
class Triangel(val base :Double, val height:Double) :Shape(){
    override fun area() :Double{
        return 0.5*base*height
    }
}