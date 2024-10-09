class Pen : Ink {
    override fun fillInk() {
        println("Ink Filled ! Good to Go!!!")
    }

    override fun inkEmpty() {
        super.inkEmpty()
        println("DONE")
    }

}
interface Ink{


    fun fillInk()
   open fun inkEmpty(){
        println("Ink bottle needs to be bought again")
    }
}
fun main(){

    var pen=Pen()
    pen.fillInk()
    pen.inkEmpty()

}