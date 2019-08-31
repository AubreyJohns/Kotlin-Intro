package Spices


sealed class Spice(var name: String , var spiciness: String = "mild", color: SpiceColor): SpiceColor by color{
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
    abstract fun prepareSpice()
}

class Curry(color: SpiceColor = YellowSpiceColor): Spice("curry", "hot", color), Grinder{
    override fun grind(){
        println("Spice grounnd")
    }
    override fun prepareSpice(){
        grind()
        println("Spice prepared")
    }

}

interface Grinder{
    fun grind()
}

interface SpiceColor{
    var color: Color
}

object YellowSpiceColor: SpiceColor{
    override var color = Color.YELLOW
}

enum class Color(var rgb: Int){
    YELLOW(0xFFFF00)
}

fun main(){
    var curry = Curry()
    println("${curry.prepareSpice()} \n ${curry.color} \n ")
}