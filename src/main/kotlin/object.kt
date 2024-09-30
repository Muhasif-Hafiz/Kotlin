fun main(){
println(MyClass.MyObject.isPrinting())
}
class MyClass{
    companion object MyObject{
        @JvmStatic
        fun isPrinting(){
            println("This person is printing something on his keyboard viui bheru fast and quick...")
        }
    }


}