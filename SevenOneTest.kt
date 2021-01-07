fun main(args: Array<String>) {
    println("Type the first integer:")
    val num1 = readLine()!!.toInt()
    println("Type the second integer:")
    val num2 = readLine()!!.toInt()
    println("Type the third integer:")
    val num3 = readLine()!!.toInt()
    println("The largest one is: " + findMax(num1, num2, num3))
}

fun findMax(x: Int, y: Int, n: Int): Int{
    return if (x > y && x > n) {
        x
    } else if  (y > x && y > n) {
        y
    } else {
        n
    }
}