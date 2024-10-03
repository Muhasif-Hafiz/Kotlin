fun main(){
//    var coldCoffeeVariable=coldCoffee
//    coldCoffeeVariable()
    var bevarage=chooseBevarage(2) {

        "I took $it scoops"
    }
    bevarage()
}
var coldCoffee : () ->Unit={

    println("I choose a ColdCoffe")
}
var milkshake : ()->Unit={
    println("I choose a milkshake")
}

fun chooseBevarage( car :Int, scoop:(Double)->String) : ()->Unit{
    println(scoop(2.0))
    return milkshake
}