//kotlin intro
lateinit var age:String
fun main(){
    //nullable variable
    var notNullInt: Int? = 1
    //check for null
    println(notNullInt?.inc() ?: 0)
    //when cases equivalent of switch
    var fishName = "haddock"

    when(fishName.length){
        0-> println("Fish must have a name")
        in 3 .. 15 -> println("Good fish name")
        else -> println("OK fish name")
    }

    //for loop and list
    var numbers = arrayOf(11, 12, 13, 14, 15)

    var emptyList: MutableList<String>

    for (number in numbers){
        emptyList = mutableListOf(number.toString())
        println(emptyList)
    }

    //for loop
    for (num in 0 .. 100){
        if ((num.toDouble())%7.toDouble()==0.toDouble()){
            println(num)
        }
    }

    //print to console and read from console
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