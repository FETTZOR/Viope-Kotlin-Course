fun main(args: Array<String>) {
    println("Type an integer #1: ")
    val num1 = readLine()!!.toInt();
    println("Type an integer #2: ")
    val num2 = readLine()!!.toInt();
    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 * $num2 = ${num1 * num2}")
}

//Type an integer #1:
//5
//Type an integer #2:
//4
//5 + 4 = 9
//5 - 4 = 1
//5 * 4 = 20