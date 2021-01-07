fun main(args : Array<String>) {
    val pairs = mutableMapOf(1 to "Kotlin", 2 to "Java", 3 to "C#", 4 to "Javascript")
    println("Enter a programming language:")
    val ask = readLine()
    if (pairs.containsValue(ask)) {
    println("Value found")
    }
    else    {
        println("Value not found")
    }
}