fun main(){
    //val random = random()
    //val random1 = { Math.random()}
    //println(random)
    //println(random1)
    val rollDice = {sides: Int-> if (sides == 0) 0 else (1..12).random()}
    println(rollDice(5))
    val rollDice2: (Int) -> Int  = {sides -> if (sides == 0) 0 else (1..12).random()}
    println(rollDice2(0))
    println("Roll dice\n")
    gameplay(rollDice2(6))
}

fun gameplay(diceRoll: Int) {
    println(diceRoll)
}