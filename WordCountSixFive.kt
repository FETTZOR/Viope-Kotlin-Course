fun main(args: Array<String>) {
    var count = 0
    while (true) {
        println("Type a word (Type x to exit)")
        var input = readLine()
        if (input == "x") {
            break;
        }
        count++
    }
    println("You typed $count words")
}


//Type a word (Type x to exit)
//Hello
//Type a word (Type x to exit)
//Kotlin
//Type a word (Type x to exit)
//Viope
//Type a word (Type x to exit)
//x
//You typed 3 words