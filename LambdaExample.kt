fun main(args: Array<String>) {
    val firstLambda: (String) -> String = { text -> "The length = ${text.length}" }
    // Send lambda to another function as an argument
    lengthMsg("Hello again!", firstLambda)
}

fun lengthMsg(msg: String, calcLength: (String) -> String) {
    // Calls the lambda
    println(calcLength(msg))
}