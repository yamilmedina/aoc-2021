package day1

import utils.Utils

lateinit var input: List<Int>

fun main() {
    input = Utils.readInput("day1/input.txt").map { it.toInt() }

    val increasedCount =
        input.windowed(3)
            .map { it.sum() }
            .zipWithNext()
            .count { (a, b) ->
                a < b
            }

    println(increasedCount)

}
