fun main(args: Array<String>) {
    printGreeting("John")
    printGreeting("John", "Johnson")
}

fun printGreeting(firstName: String) {
    println("Hello $firstName")
}

fun printGreeting(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

//Hello John
//Hello John Johnson