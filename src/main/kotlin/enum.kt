fun main()
{

var day=Days.SUNDAY
    println(day.today())
    day.allDays()
}

enum class Days(){
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY();
    fun today(){
        println("Today is $this")
    }
    fun allDays(){
        for(i in Days.values()){
            println(i)
        }
    }
}