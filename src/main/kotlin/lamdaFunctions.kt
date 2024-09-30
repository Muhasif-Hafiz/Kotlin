
    fun main(){
     var milkshakevariable : ()->Unit=chooseBevarage(scoops)
        milkshakevariable()
    }

    var coldCoffee:()->Unit ={
        println("I took a Cold coffee")
    }
    var milkShake : ()->Unit={
      println("I took a milkshake")
    }
    var scoops : (Int)->String={numberOfScoops->
        "I took $numberOfScoops scoops for my drink"
    }
fun chooseBevarage(scoops:(Int)->String) : ()->Unit{
    println(scoops(2))
    return milkShake
}