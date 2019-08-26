//kotlin intro
lateinit var age:String
fun main(){
    var notNullInt: Int? = 1
    println(notNullInt?.inc() ?: 0)

    var fishName = "haddock"
    when(fishName.length){
        0-> println("Fish must have a name")
        in 3 .. 15 -> println("Good fish name")
        else -> println("OK fish name")
    }

    var numbers = arrayOf(11, 12, 13, 14, 15)
    var emptyList: MutableList<String>
    for (number in numbers){
        emptyList = mutableListOf(number.toString())
        println(emptyList)
    }



    println("Enter your name")
    var name=readLine().toString()
    println("Enter tribe")
    var tribe:String? = readLine().toString()
    println("Enter age")
    age = readLine().toString()
    println("Hello $name")
    println("Age: $age")
    println("Tribe: $tribe")
}