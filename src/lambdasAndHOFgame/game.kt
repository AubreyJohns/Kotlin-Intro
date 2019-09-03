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



fun main (){
    var game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
}