fun main(args: Array<String>) {
    println("Type an integer:")
    val num1 = readLine()!!.toInt()
    if (isEven(num1, even = true) as Boolean){
        print("Even ")
    }
    else
        print("Odd ")
}

fun isEven(num1: Int, even: Boolean): Any? {
    return num1 % 2 == 0
}


//Type an integer:
//12
//Even