open class Inheritance ( val name : String){

  open  fun commonFeatures(){
        println("$name has some common features")
    }
}
class Bike(name : String) : Inheritance(name){

    fun specificFeatures(){
        println("$name has a specific feature")
    }
    override fun commonFeatures(){
        println("This is a overridden method")
    }

}
fun main(){
    val car =Inheritance("Wagon R")
    car.commonFeatures()
    val bike = Bike("Hero Honda")
    bike.commonFeatures()
    bike.specificFeatures()
}