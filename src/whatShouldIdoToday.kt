fun main (){
    println(whatShouldIdoToday("happy", "Sunny"))
    print("Enter mood:")
    whatShouldIdoToday(readLine()!!)
    print("Enter mood:")
    whatShouldIdoToday(readLine().toString(), "Rainy", 0)
}

fun whatShouldIdoToday(mood: String, weather: String = "Sunny", temperature: Int = 24){
    return println(when{
        isGoForAWalk(mood,weather) -> "go for a walk"
        isStayInBed(mood, weather , temperature) -> "Stay in bed"
        isGoSwimming(temperature) -> "go swimming"
        else -> "Stay home and read"
    })
}

fun isGoForAWalk(mood: String,weather: String) = mood == "happy" && weather == "Sunny"
fun isStayInBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "Rainy" && temperature == 0
fun isGoSwimming(temperature: Int) = temperature>35