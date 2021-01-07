fun main(args : Array<String>) {
    val names = mutableListOf("Jim", "Mary", "Matt", "Priscilla", "Mike", "Kelly")
    fun count(){
        val filteredNames = names.filter { it.startsWith("M") }
        println(filteredNames.size)
    }
    count()
}