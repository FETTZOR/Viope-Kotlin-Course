import java.util.Scanner

fun main(args: Array<String>) {
    val scanner  = Scanner(System.`in`)
    println("Type the first number: ")
    val num1 = scanner.nextInt()
    println("Type the second number: ")
    val num2 = scanner.nextInt()
    println("Type the operator (+,-,*):")
    val res = scanner.next()
    when(res) {
        "+" -> println("$num1 + $num2 = ${num1 + num2}")
        "-" -> println("$num1 - $num2 = ${num1 - num2}")
        "*" -> println("$num1 * $num2 = ${num1 * num2}")
        else -> println("Unknown")
    }
}