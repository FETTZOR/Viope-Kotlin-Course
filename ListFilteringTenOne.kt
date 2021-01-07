fun main(args : Array<String>) {

    val words = mutableListOf("Kotlin", "Programming", "String", "List",  "Algorithm")
    fun filter() {
        val filteredNames = words.filter { it.length < 7 }
        println(filteredNames.toString())
    }
    filter()
}

//[Kotlin, String, List]