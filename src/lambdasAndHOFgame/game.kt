package lambdasAndHOFgame

enum class Directions{
    NORTH, WEST, EAST, SOUTH, START, END
}
class Game{
    var path = mutableListOf<Directions>(Directions.START)
    var north = {path.add(Directions.NORTH)}
    var south = {path.add(Directions.SOUTH)}
    var east = {path.add(Directions.EAST)}
    var west = {path.add(Directions.WEST)}
    var end = {path.add(Directions.END); println("Game Over: $path"); path.clear(); false}
}

fun List<Int>.divisibleBy3(block: (Int) -> Int): List<Int>{
    var result = mutableListOf<Int>()
    for (item in this){
        if(block(item) == 0){
            result.add(item)
        }
    }
    return result
}


fun main (){
    var game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divisibleBy3 {it.rem(3)})
}