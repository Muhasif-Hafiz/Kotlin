// fun main(){
     //var sum=add(1,2,3,4,5,67,863,2,43,2,2,3,3,3,3,3,3,4,224,2342,334435,23453,343,245)
// }
//     println("The sum is : $sum")
// }
//fun addition(a:Int ,b:Int,c:Int, d:Int ) : Int{
//    return a+b+c+d
//}
// fun add(vararg numbers :Int ) :Int{
//     var sum=0;
//     for(i in numbers){
//         sum+=i
//     }
//////     return sum
// }
//////                                LOOPS

//fun main() {
///    var num = 0
//    for (i in 1..10) {
//        num++
//       if(num==7){
//         break
//       }
////        println("Number is  : $num")
////
////    }
////}
//
//    for (i in 10 downTo 1 step 2) {
//        println("$num   ")
//        num++
//    }
////}
//
/*
*  
* */




















//    while(num<=10){
//        println(" number is : $num")
//        num++
//    }
//
//}
////             ->                  { -----  PATTERNS---- }                        <-

////fun main(){
//    var num=5
//    for(i in 1..num){
//        for(j in 1..i){
//            print("* ")
//        }
//        println()
//    }
//}
//            ->                  { -----      NESTED LOOPS --- }                        <-
//
//
//fun main() {
//    var num = 0
//   outer@ while (num < 10) {
//        println("This is outer loop !!")
//        num++
//        var i = 0
//        while (i < 2) {
//            i++
//            if (i == 2) {
//                break@outer
//            }
//            println("this is inner loop !!")
//
//        }
//    }
//}

 //            ->                  { ----- Arrays --- }                        <-

// fun main(){
//     var nums : Array<Int> = arrayOf(1,2,3,4,5,6,7,45,2,3,2,2,47,2)
//    for(i in nums){
//        println("Element is  : $i")
//    }
// }

//fun main(){
//    var names :Array<String> = arrayOf( "hafeezullah Ganaie", "Saleema Begum ","Aruba Hafeez","Muhasib", "Mehjooba", "Azka ")
//    var j=1
//    for (i in names){
//
//        println("Member  $j is : $i")
// j++
//    }
//
//}

//fun main(){
//    var mixed = arrayOf(1,2,3,4,5,6,"muhasib","tabinda",'a',true)
//    for(i in mixed){
//        if(i is Int){
//            println(i)
//        }
//    }
//}

fun main(){
   var car1=Car("Maruti Suzuki", "Swift Dezire","Black",4)
//    car1.name="Maruti Suzuki"
//    car1.model=" Swift Dezire"
//    car1.colour="White"
//    car1.doors=4
    println("The Name of car is : ${car1.name}")
    println("The Model of car is : ${car1.model}")
    println("The Colour car is : ${car1.colour}")
    println("The number of doors car has is : ${car1.doors}")

    car1.move()
    car1.stop()
    car1.accelerate(20)

    println()
    var car2=Car("Tesla","S Plaid","White",2)
//    car2.name="Mahindra"
//    car2.model="Fortuner"
//    car2.colour="Black"
    // car2.doors=5
    println("The Name of car is : ${car2.name}")
    println("The Model of car is : ${car2.model}")
    println("The Colour car is : ${car2.colour}")
    println("The number of doors car has is : ${car2.doors}")

    car2.move()
    car2.stop()
    car2.accelerate(20)

}
class Car( name : String,model:String, colour:String,doors:Int){
var name =name
    var colour=colour
    var model=model
    var doors=doors

    fun move(){
        println("The $name is moving !!")
    }
    fun stop(){
        println("The $name has stopped moving !!")
    }
    fun accelerate(a:Int){
        println("The $name has increased speed by $a")
    }


}