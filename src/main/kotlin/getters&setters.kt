fun main(){
    var p1=Person1("Muhasib","Hafeez", -8)

    println(p1.firstName)
    println(p1.lastName)
    println(p1.age)

}
class Person1(firstName :String, lastName :String, age :Int) {
    var firstName: String = firstName
        get() {
            return " First Name is : $field".toUpperCase()
        }
//        set(value) {
//            field=value
//        }
    var age :Int=age
    
        set(value) {
            if(age >0){
                field=value
            }
            else{
                println("Age can not be negative !")
            }
        }
    var lastName :String=lastName

}
