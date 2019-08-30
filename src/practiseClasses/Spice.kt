package practiseClasses

class Spice( var name: String , var spiciness: String = "mild"){

    var heat: Int
        get() = if(spiciness == "mild") 5 else 10
        set(value) {}
    init {
       //println("Name: $name\n Spiciness: $heat")
    }
    init {
            var spicy: List<String> = listOf(name).filter { heat == 10 }
            println("$spicy")
    }
}
fun makeSalt() = Spice("Salt")

fun main (){
    var spiceObjects = listOf(Spice("curry", "hot"),Spice("pepper"), Spice("cayenne", "low"), Spice("ginger", "hot"), Spice("red curry"), Spice("green curry", "low"), Spice("red pepper", "hot"))
    var spice= Spice("Royco", "mild")
}