package day1

import utils.Utils

fun main() {
    val input = Utils.readInput("day1/input.txt").map { it.toInt() }
    // count increasing parts, O(n)

    println(input.zipWithNext().count { (a, b) -> a < b })
}
