fun main(){
    var p1=Mobile()
 println(p1.onTouch())


}
interface Screen{
    fun onTouch()
}
 class Mobile :Screen{
    override fun onTouch() {
        println("Screen got touched")
    }
    var name=""
    fun calling()=println("Calling Tabinda")

}
