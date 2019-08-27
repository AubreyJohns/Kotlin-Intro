fun main(args: Array<String>){
    var fortune: String

    for(i in 1..10){
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if(fortune.contains("Take it easy")) break
    }
}

fun getBirthday(){

}

fun getFortune(birthday: Any): String {

}
