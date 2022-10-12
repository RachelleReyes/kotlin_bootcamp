package lesson5FunctionalManipulation

import kotlin.math.absoluteValue

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    val map = Location()

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = {
        path.add(Directions.END)
        print("Game Over: ")
        println(path)
        path.clear()
        false
    }

    private fun move(where: () -> Boolean){
        where.invoke()

    }

    fun makeMove(move: String?) {
        when(move) {
            "n" -> {
                move(north)
                map.updateLocation(Directions.NORTH)
            }
            "s" -> {
                move(south)
                map.updateLocation(Directions.SOUTH)
            }
            "e" -> {
                move(east)
                map.updateLocation(Directions.EAST)
            }
            "w" -> {
                move(west)
                map.updateLocation(Directions.WEST)
            }
        }
    }
}

class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    var currentLocation = Pair(0, 0)

    init {
        map[0][0] = "Zero zero"
        map[0][1] = "Zero one"
        map[0][2] = "Zero two"
        map[0][3] = "Zero three"

        map[1][0] = "One zero"
        map[1][1] = "One one"
        map[1][2] = "One two"
        map[1][3] = "One three"

        map[2][0] = "Two zero"
        map[2][1] = "Two one"
        map[2][2] = "Two two"
        map[2][3] = "Two three"

        map[3][0] = "Three zero"
        map[3][1] = "Three one"
        map[3][2] = "Three two"
        map[3][3] = "Three three"
    }

    fun updateLocation(direction: Directions) {
        if (direction == Directions.NORTH) {
            currentLocation = Pair(currentLocation.first, (currentLocation.second + 1).rem(height))
        } else if (direction == Directions.SOUTH) {
            currentLocation = Pair(currentLocation.first, (currentLocation.second - 1).absoluteValue.rem(height))
        } else if (direction == Directions.EAST) {
            currentLocation = Pair((currentLocation.second + 1).rem(width), currentLocation.second)
        } else if (direction == Directions.WEST) {
            currentLocation = Pair((currentLocation.second - 1).absoluteValue.rem(width), currentLocation.second)
        }
    }

    fun getDescription(): String? {
        return map[currentLocation.first.rem(width)][currentLocation.second.rem(height)]
    }

}

fun main(args: Array<String>) {
    val game = Game()
//    println(game.path)
//    game.north()
//    game.south()
//    game.west()
//    game.end()
//    println(game.path)

    while(true) {
        print("Enter a direction: n/s/e/w:")
        val direction = readLine()
        game.makeMove(direction)
    }
}