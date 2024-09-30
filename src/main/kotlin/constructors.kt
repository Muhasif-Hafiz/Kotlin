////fun main(){
////    var factory=Factory("GOOGLE","Banglore",2000)
////    println(factory.name)
////    println(factory.address)
////    println(factory.land)
////    factory.manufacturing()
////    factory.salary()
////
////
////}
////class Factory(C_name:String, C_address :String, C_land :Int){
////    var name =C_name
////    init {
////       println("The name of the comapny is $name")
////    }
////    var address=C_address
////    init{
////        println("The address of the company is $address")
////    }
////    var land=C_land
////    init{
////        println("Total land  covered by  the company is $land")
////    }
////    fun manufacturing(){
////        println("The company manufactures toys and cycles every month")
////    }
////    fun salary(){
////        println("The company provides  salary at evert month end")
////    }
////
////
////}
//
//
//
//fun main(){
//    var car1=Carr("Tesla","S Plaid","Blue", 4)
//}
//fun Carr(
////    val name,
//    val model: String,
//    val colour: String,
//    val doors: Int
//){
//    fun drive(){
//    }
//    fun stop(){
//
//    }
//}
//fun main(){
//    var car=Automobiles("Tesla",4,55)
//    car.moving()
//    car.stop()
//    println(car.name)
//}
//class Automobiles(val name :String, val seats :Int, val size :Int){
//    fun moving(){
//        println("The $name is moving !!")
//    }
//    fun stop(){
//        println("The $name has stopped as it has  only $seats seats")
//    }
//}
//fun main(){
// var car5=Vehicle("Tesla", "S Plaid")
//
//
//}
//class Vehicle(val name: String, val model :String, val colour :String){
//    init{
//        println("The name of the car is $name")
//    }
//    constructor(name1:String, model1 :String) :this(name1,model1,"Dont care"){
//
//    }
////}
//fun main(){
//    var car=Auto("Tesla","S Plaid",4)
//    car.seats="No seats left"
//
//}
//class Auto(name :String, model:String, doors:Int){
//lateinit var seats :String
//
//}
//fun main(){
// var person1=Person("     Ali     ",22)
//    person1.age=-87
//    println(person1.name)
//    println(person1.age)
//}
//class Person(nameParam :String, ageParam:Int){
//    var name :String=nameParam
//        get() {
//            println("Getter has been written")
//            return field.toUpperCase().trim()
//        }
//    var age :Int =ageParam
//        set(value){
//            if(value>0)
//            {
//                field=value
//            }
//            else
//            {
//                println("Age can't be negative !")
//            }
//        }
//}
fun main(){
    var car=Person("Ali",83)

}
class Person(nameParam :String, ageParam:Int){

}