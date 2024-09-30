fun main() {
var m1=Masjid()
    println(m1.isTarawee())
}

abstract class Markaz {

    abstract fun isSalah()
    abstract fun isTarawee()
}
open class Masjid:Markaz() {
    override fun isSalah() {
        println("It is namaz time !")
    }

    override fun isTarawee() = println("It is tarawee time ")
}