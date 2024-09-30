fun main(args :Array<String>){
    val numbers :Array<Int> = arrayOf(2832,8734,39,93,373,93764,94746,494646,8464)
    var maxi :Int=maximum(numbers)
    println("The maximum number in the given Array is : ${maxi}")
    println("The minimum number in the given Array is : ${minimum(numbers)}")
}
fun maximum(numbers:Array<Int>) : Int{
    var max :Int=Int.MIN_VALUE
    for(i in numbers){
        if(i>max){
            max=i
        }
    }
    return max
}
fun minimum(numbers :Array<Int>) :Int{
    var mini:Int=Int.MAX_VALUE
    for(i in numbers){
        if(i<mini){
            mini=i
        }
    }
    return mini
}