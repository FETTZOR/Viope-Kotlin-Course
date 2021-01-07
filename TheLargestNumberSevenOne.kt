fun main(args: Array<String>) {

    println("The largest one is: ")
}

fun findMax() {
    println("Type the first integer:")
    val num1 = readLine()!!.toInt()
    println("Type the second integer:")
    val num2 = readLine()!!.toInt()
    println("Type the third integer:")
    val num3 = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        return
    }
}