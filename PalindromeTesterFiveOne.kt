fun main(args: Array<String>) {
    println("Type a word:")
    val word = readLine()?.toLowerCase();
    if(word == word?.reversed()){
        println("The word $word is palindrome")
    }
    else{
        println("The word $word is not palindrome")
    }
}

//Type a word:
//Rotator
//The word rotator is palindrome