fun main(){
    println("${canAddFish(10.0, listOf(3, 3, 3))} \n" +
            "${canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false)},\n" +
            "${canAddFish(9.0, listOf(1, 1, 3), 3)},\n" +
            "${canAddFish(10.0, listOf(), 7, true)}")
}

fun canAddFish(gallons: Double, lengthOfFishInTank: List<Int>, lengthOfNewFish: Int = 2, hasDecorations: Boolean = true): Boolean {

    var canAdd = true
    var capacityInInches: Double = 0.0
    var inchesOfFish: Int = 0

    if (hasDecorations){
        capacityInInches += (0.8 * gallons)
        for (fish in lengthOfFishInTank){
            inchesOfFish += fish
        }
        inchesOfFish += lengthOfNewFish
        canAdd = inchesOfFish<=capacityInInches
    }
    else{
        capacityInInches = gallons
        for (fish in lengthOfFishInTank){
            inchesOfFish += fish
        }
        inchesOfFish += lengthOfNewFish
        canAdd = inchesOfFish<=capacityInInches
    }

    return canAdd
}
//better way to do it
/*
fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}
 */
//.sum() adds all elements in a list

