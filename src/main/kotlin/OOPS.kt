fun main(){
  var p1=Parent()
  p1.name="Hafeezullah Ganaie"
    p1.age=55
    println("${p1.name}")
    println(p1.age)
    var child=Child()
    child.name="Muhasib"
    child.age=20
    println(child.name)
    println(child.age)
    println(child.isStudying())
    println(child.isEating())
    println(child.isPlaying())
}
open  class Parent{
    var  name :String =""
    var age : Int =0
    var address :String=""
  open  fun isPlaying(){
        println("$name is playing !!")
    }
    fun isEating(){
        println("$name is having dinner! ")
    }
}
class Child : Parent(){
    override fun isPlaying(){
        println("$name is playing cricket")
    }

    fun isStudying(){
        println("$name is studying")
    }
    var instaID :String=""
}