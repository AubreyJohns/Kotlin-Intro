import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>){
    println("This is AMS")

    if (args.isEmpty()) {
        var time = LocalDateTime.now()
        var formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        var formatted = time.format(formatter)
        println("The time is $formatted")
    }else{
        println("${if ((args[0].toInt())<12) {println("Good morning, Kotlin")} else {println("Good night, Kotlin")}}")
    }

    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")

    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println (when (day){
        1 -> "It's Sunday"
        2 -> "It's Monday"
        3 -> "It's Tuesday"
        4 -> "It's Wednesday"
        5 -> "It's Thursday"
        6 -> "It's Friday"
        7 -> "It's Saturday"
        else -> "Time has stopped"
    })
}