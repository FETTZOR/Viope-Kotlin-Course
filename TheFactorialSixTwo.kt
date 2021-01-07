fun factorial(n: Int): Int {
    return if (n == 0) 1
    else n * factorial(n - 1)
}

fun main(args: Array<String>) {
    println("Type an integer:")
    val num = readLine()!!.toInt()
    println("The factorial of " + num + "=" + factorial(14))
}
//Type an integer:
//14
//The factorial of 14 = 1278945280