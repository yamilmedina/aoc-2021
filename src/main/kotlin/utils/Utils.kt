package utils

import java.io.File
import java.net.URL

class Utils private constructor() {

    companion object {
        fun readInput(fileName: String): List<String> {
            return File("src/main/resources", fileName).readLines()
        }
    }

}
