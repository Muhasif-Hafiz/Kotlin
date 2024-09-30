fun main(){
    var p1=Person6(1,"John")
    var p2=Person6(2,"John")
//    println(p1.name)
//    println(p1.id)
//    println(p2.name)
//    println(p2.id)
//    println(p1==p2)
//    var p3=p2.copy()
//    println(p3.name)
//    println(p1==p3)
    var(id:Int,name:String)=p1
    println(id)
}
data class Person6(val id :Int, val name:String){

}