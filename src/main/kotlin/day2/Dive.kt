package day2

import utils.Utils

fun main() {
    part1()
    part2()
}

fun part2() {
    var horizontal = 0
    var aim = 0
    val depth = Utils.readInput("day2/input.txt")
        .map { Pair(it.split(" ")[0], it.split(" ")[1].toInt()) }
        .fold(0) { acc, pair ->
            when (pair.first) {
                "down" -> {
                    aim += pair.second
                    acc
                }
                "up" -> {
                    aim -= pair.second
                    acc
                }
                else -> {
                    horizontal += pair.second
                    acc + (aim * pair.second)
                }
            }
        }

    println(horizontal * depth)
}

fun part1() {
    var horizontal = 0
    val depth = Utils.readInput("day2/input.txt")
        .map { Pair(it.split(" ")[0], it.split(" ")[1].toInt()) }
        .fold(0) { acc, pair ->
            when (pair.first) {
                "down" -> acc + pair.second
                "up" -> acc - pair.second
                else -> {
                    horizontal += pair.second
                    acc
                }
            }
        }

    println(horizontal * depth)
}