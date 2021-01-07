import java.util.*
import java.io.File

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var file = File("readme.txt")
    while(true) {
        println("Type a line:")
        var input_word = reader.nextLine()
        if (input_word != "exit") {
            file.appendText(input_word)
        }
        else{
            break;
        }
    }
    file.forEachLine { println(it) }
}