class Cake{

   var flavour : String = ""
    var quantity :Int=0

  constructor(flavour :String, quantity: Int){
      this.flavour=flavour
      this.quantity=quantity
  }
    constructor(flavour: String){


        this.flavour=flavour
    }

}
fun main(){

    var vanillaCake=Cake("Vanilla",4)
    var chocolateCake=Cake("Chocolate Cake")

println(vanillaCake.flavour)
    println(vanillaCake.quantity)
    println(chocolateCake.flavour)
}