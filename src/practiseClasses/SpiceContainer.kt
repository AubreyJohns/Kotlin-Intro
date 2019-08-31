package practiseClasses

data class SpiceContainer(val name: String){
    val label: String = name
}

fun main(){
    var curry = SpiceContainer("curry")
    println(curry)
}